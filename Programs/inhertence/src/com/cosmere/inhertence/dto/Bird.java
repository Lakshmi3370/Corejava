package com.cosmere.inhertence.dto;

public class Bird {
String birdName;
byte legs;
boolean fly;
String color;
float weight;

public Bird() {
	System.out.println("Invoking Bird details");
	}
public String birdName(String birdName) {
	return this.birdName=birdName;
}
public byte legs(byte legs) {
	return this.legs=legs;
}
public boolean fly(boolean fly) {
	return this.fly=fly;
}
public String color(String color) {
	return this.color=color;
}
public float weight(float weight) {
	return this.weight=weight;
}

}
