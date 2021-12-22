package com.cosmere.inhertence.dto;

public class Developer {
 
	String designation;
	String company;
	double salary;
	byte id;
	String location;
	
	public Developer() {
		System.out.println("Invoking Developer details");
		}
	public Developer(int pinCode) {
		this("lakshmi987@gmail.com");
		System.out.println(pinCode);
	}
	
	public Developer(String emailId) {
		System.out.println(emailId);
	}
	
public String designation(String designation) {
	return this.designation=designation;
}
public String company(String company) {
	return this.company=company;
}
public double salary(double salary) {
	return this.salary=salary;
}
public byte id(byte id) {
	return this.id=id;
}
public String location(String location) {
	return this.location=location;
}
}
