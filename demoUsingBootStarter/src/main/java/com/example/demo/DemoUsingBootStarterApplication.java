package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoUsingBootStarterApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoUsingBootStarterApplication.class, args);
		Customer customer = context.getBean(Customer.class);
		customer.diasplay();
	}

}
