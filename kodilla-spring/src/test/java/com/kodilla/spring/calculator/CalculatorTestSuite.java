package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void add_testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        double numberA = 4.5;
        double numberB = 3.2;

        //When
        double add = calculator.add(numberA, numberB);

        //Then
        Assert.assertEquals(7.7, add, 0.002);
    }

    @Test
    public void sub_testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        double numberA = 8.9;
        double numberB = 3.7;
        //When
        double sub = calculator.sub(numberA, numberB);
        //Then
        Assert.assertEquals(5.2, sub, 0.002);
    }

    @Test
    public void mul_testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double numberA = 4.1;
        double numberB = 0.2;
        //When
        double mul = calculator.mul(numberA, numberB);
        //Then
        Assert.assertEquals(0.82, mul, 0.002);
    }

    @Test
    public void div_testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        double numberA = 8.1;
        double numberB = 4.2;
        //When
        double div = calculator.div(numberA, numberB);
        //Then
        Assert.assertEquals(1.93, div, 0.002);
    }
}
