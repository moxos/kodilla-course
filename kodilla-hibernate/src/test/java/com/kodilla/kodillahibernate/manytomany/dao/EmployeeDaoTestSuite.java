package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindByLastName() {

        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        List<Employee> employees = employeeDao.findByLastName("Smith");

        assertEquals(6, employees.size());

        employeeDao.deleteById(johnSmith.getId());
    }
}
