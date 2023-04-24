package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
