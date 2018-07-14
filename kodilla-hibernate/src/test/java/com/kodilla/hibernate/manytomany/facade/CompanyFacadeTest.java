package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findEmployeesWithLastnameContaining() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Krzysztof", "Kowalski");
        Employee employee3 = new Employee("Hilary", "Nowak");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> employees = companyFacade.findEmployeesWithLastnameContaining("walsk");

        //Then
        try {
            Assert.assertEquals(2, employees.size());
        } finally {
            //CleanUp
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
        }
    }

    @Test
    public void findCompaniesWithNameContaining() {
        Company company1 = new Company("Amaranda");
        Company company2 = new Company("Clarine");
        Company company3 = new Company("Amarando");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companies = companyDao.findCompaniesWithNameContaining("aran");

        //Then
        try {
            Assert.assertEquals(2, companies.size());
        } finally {
            //CleanUp
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
        }
    }
}