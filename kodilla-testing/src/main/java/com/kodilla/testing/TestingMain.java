package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Test - pierwszy test jednostkowy:");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - drugi test jednostkowy:");
        Calculator calculator = new Calculator();
        int result1 = calculator.add(2, 8);
        if (result1 == 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result2 = calculator.substract(-19, 8);
        if (result2 == -27) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}


