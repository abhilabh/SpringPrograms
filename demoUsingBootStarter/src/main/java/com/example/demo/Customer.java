package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	int id;
	String name;
	String className;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void diasplay() {
		System.out.println("object created");
		address.displayAdd();
		
	}

}
