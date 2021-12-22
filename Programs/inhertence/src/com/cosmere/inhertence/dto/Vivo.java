package com.cosmere.mobile.dto;

public class Vivo extends Phone {
	int cost;
	byte ram;
	byte rom;
	String model;
	String color;
	
	
	public Vivo() {
		System.out.println("Invoking vivo details");
		
	}
	
	public int cost(int cost) {               
	return this.cost=cost;
	}
	
	public byte ram(byte ram) {
		return this.ram=ram;
		
	}
	
	public byte rom(byte rom) {
		return this.rom=rom;
	}
	
	public String model(String model) {
		return this.model=model;
	}
	public String color(String color) {
		return this.color=color;
	}
}
