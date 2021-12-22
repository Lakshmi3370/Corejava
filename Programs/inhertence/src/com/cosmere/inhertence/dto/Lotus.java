package com.cosmere.inhertence.dto;

public class Lotus extends Flower {
String type;
String color;
byte noOfpetals;
int price;
float height;

public Lotus() {
	this(45);
	System.out.println("Invoking Lotus details");
}
public Lotus(int price) {
	super("Red");
	System.out.println(price);
}
public String type(String type) {
	return this.type=type;
}
public String color(String color) {
	return this.color=color;
}
public float height(float height) {
	return this.height=height;
}
public byte noOfpetals(byte noOfpetals) {
	return this.noOfpetals=noOfpetals;
}
public int price(int price) {
	return this.price=price;
}

}
