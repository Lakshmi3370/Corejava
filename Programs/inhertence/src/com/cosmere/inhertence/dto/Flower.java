package com.cosmere.inhertence.dto;

public class Flower {
String name;
String color;
float height;
int noOfpetals;
int price;

public Flower() {
	System.out.println("Invoking Flower details");
}
public Flower(String color) {
	System.out.println(color);
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
public int noOfpetals(int noOfpetals) {
	return this.noOfpetals=noOfpetals;
}
public int price(int price) {
	return this.price=price;
}

}
