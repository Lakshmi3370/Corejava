package com.cosmere.inhertence.dto;

public class Peacock extends Bird {
	String color;
	boolean swim;
	float weight;
	float height;
	byte noOfFethers;
	
	public Peacock() {
		System.out.println("Invoking Peacock details");
	}

	public String color(String color) {
		return this.color=color;
		
	}
	
	public boolean swim(boolean swim) {
		return this.swim=swim;
		
	}
	
	public float weight(float weight) {
		return this.weight=weight;
		 
	}
	
	public float height(float height) {
		return this.height=height;
		
	}
	
	public byte noOfFethers(byte noOfFethers) {
		 return this.noOfFethers=noOfFethers;

	}
}


