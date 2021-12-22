package com.cosmere.inhertence.dto;

public class Fruits {
	
String fruitName;
String calcium;
float protein;
float totalFat;
float vitaminA;

public Fruits() {
	System.out.println("Invoking fruit details");
}
public String fruitName(String fruitName) {
	return this.fruitName=fruitName;
}
public String calcium(String calcium) {
	return this.calcium=calcium;
}
public float protein(float protein) {
	return this.protein=protein;
}
public float totalFat(float totalFat) {
	return this.totalFat=totalFat;
}
public float vitaminA(float vitaminA) {
	return this.vitaminA=vitaminA;
}
}
