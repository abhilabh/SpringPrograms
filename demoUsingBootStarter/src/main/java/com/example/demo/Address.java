package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String name;
	String city;
	public Address(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Address() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void displayAdd() {
		System.out.println("Autowired test");
		
	}

}
