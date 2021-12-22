package com.cosmere.inhertence.dto;

public class Wood {
String name;
String color;
float height;
float width;
int price;

public  Wood() {
	System.out.println("Invoking Wood details");
}
public String name(String name) {
	return this.name=name;
}
public String color(String color) {
	return this.color=color;
}

public float height(float height) {
	return this.height=height;
}
public float width(float width) {
	return this.width=width;
}
public int price(int price) {
	return this.price=price;
}
}
