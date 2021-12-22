package com.cosmere.inhertence.dto;

public class Institute {
String name;
String location;
short noOfstaffs;
String area;
String batch;

public Institute() {
	System.out.println("Invoking Institute details");
	}
	public String name(String name) {
		return this.name=name;
	}
	public String location(String location) {
		return this.location=location;
	}
	public short noOfstaffs(short noOfstaffs) {
		return this.noOfstaffs=noOfstaffs;
	}
	public String area(String area) {
		return this.name=name;
	}
	public String batch(String batch) {
		return this.name=name;
	}

}
