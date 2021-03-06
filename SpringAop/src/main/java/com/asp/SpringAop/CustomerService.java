package com.asp.SpringAop;

import javax.sound.midi.Soundbank;

public class CustomerService {
	String nameString;
	String url;
	public CustomerService(String nameString, String url) {
		//super();
		this.nameString = nameString;
		this.url = url;
	}
	@Override
	public String toString() {
		return "CustomerService [nameString=" + nameString + ", url=" + url + "]";
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public CustomerService() {
		super();
	}
	public void printName() {
		System.out.println("customer name "+ this.nameString);
	}
	public void printUrl() {
		System.out.println("customer website "+ this.url);
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
