package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ProductDao extends CrudRepository<Product, Integer> {
}