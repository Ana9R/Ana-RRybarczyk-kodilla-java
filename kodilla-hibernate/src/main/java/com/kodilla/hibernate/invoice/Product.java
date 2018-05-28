package com.kodilla.hibernate.invoice;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "PRODUCTS")
public class Product {
    int id;
    String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
