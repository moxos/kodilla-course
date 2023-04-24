package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Invoice invoice = new Invoice("1");
        Product product1 = new Product("Lion");
        Product product2 = new Product("Mars");
        Item item1 = new Item(new BigDecimal(15), 2, new BigDecimal(30));
        Item item2 = new Item(new BigDecimal(155), 5, new BigDecimal(775));
        item1.setProduct(product1);
        item2.setProduct(product2);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        Assertions.assertNotEquals(0, invoiceId);
        invoiceDao.deleteById(invoiceId);
    }
}
