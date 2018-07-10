package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave(){
        //given
        Product product1 = new Product();
        product1.setName("Car");
        Product product2 = new Product();
        product2.setName("Bus");
        Item item1 = new Item();
        item1.setPrice(BigDecimal.valueOf(23));
        item1.setQuantity(5);
        item1.setValue(BigDecimal.valueOf(34));
        item1.setProduct(product1);
        Item item2 = new Item();
        item2.setPrice(BigDecimal.valueOf(24));
        item2.setQuantity(5);
        item2.setValue(BigDecimal.valueOf(33));
        item2.setProduct(product2);

        Invoice invoice = new Invoice();
        invoice.setNumber("33");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        invoice.setItems(items);

        //when
        Invoice savedInvoice = invoiceDao.save(invoice);

        //then
        Assert.assertNotEquals(0, savedInvoice.getId());
        Optional<Invoice> foundInvoice = invoiceDao.findById(savedInvoice.getId());
        Assert.assertTrue(foundInvoice.isPresent());
        Assert.assertEquals(2,foundInvoice.get().getItems().size());
    }

}
