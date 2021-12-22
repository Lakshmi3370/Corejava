package com.cosmere.inhertence.dto;

public class Banana extends Fruits {
	
byte weight;
byte price;
String color;
String calories;
float protein;

public Banana() {
	System.out.println("Invoking banana details");
	}
	public byte weight(byte weight) {
		return this.weight=weight;
	}
	public byte price(byte price) {
		return this.price=price;
	}
	public String color(String color) {
		return this.color=color;
	}
	public String calories(String calories ) {
		return this.calories=calories;
	}
	public float protein(float protein) {
		return this.protein=protein;
	}
}


