package com.kodilla.kodillahibernate.manytomany.dao;


import com.kodilla.kodillahibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    List<Company> startsWith(@Param("FRAGMENT") String nameFragment);
}
