package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then

        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testCompanyDao_findCompaniesBy3firstLetters() {
        //Given
        Company company1 = new Company("Amiranda");
        Company company2 = new Company("Clarine");
        Company company3 = new Company("Amigos");
        Company company4 = new Company("Amanda");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        //When
        List<Company> companies = companyDao.findCompaniesBy3firstLetters("Ami");

        //Then
        try {
            Assert.assertEquals(2, companies.size());
        } finally {
            //CleanUp
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
            companyDao.deleteById(company4.getId());
        }
    }

    @Test
    public void testCompanyDao_findCompaniesWithNameContaining() {
        //Given
        Company company1 = new Company("Amaranda");
        Company company2 = new Company("Clarine");
        Company company3 = new Company("Amigos");
        Company company4 = new Company("Amarando");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

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
            companyDao.deleteById(company4.getId());
        }
    }

    @Test
    public void testEmployeeDao_findEmployeesBylastname() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Krzysztof", "Kowalski");
        Employee employee3 = new Employee("Michał", "Brzeski");
        Employee employee4 = new Employee("Hilary", "Nowak");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //When
        List<Employee> employees = employeeDao.findEmployeesBylastname("Kowalski");

        //Then
        try {
            Assert.assertEquals(2, employees.size());
        } finally {
            //CleanUp
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
            employeeDao.deleteById(employee4.getId());
        }
    }

    @Test
    public void testEmployeeDao_findEmployeesWithLastnameContaining() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Krzysztof", "Kowalski");
        Employee employee3 = new Employee("Michał", "Brzeski");
        Employee employee4 = new Employee("Hilary", "Nowak");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //When
        List<Employee> employees = employeeDao.findEmployeesWithLastnameContaining("walsk");

        //Then
        try {
            Assert.assertEquals(2, employees.size());
        } finally {
            //CleanUp
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
            employeeDao.deleteById(employee4.getId());
        }
    }

}


