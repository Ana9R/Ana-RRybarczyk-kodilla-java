package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5, 3);
		int result = calculator.add(5, 3);
		System.out.println("Result add:" + result);
		calculator.substract(16,9);
		int result2 = calculator.substract(16,9);
		System.out.println("Result substract:" + result2);
	}
}