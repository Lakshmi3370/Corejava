package com.cosmere.inhertence.dto;

public class Airlins {
String location;
String revenue;
float ratings;
int foundedYear;
int totalAirlins;

public Airlins() {
	System.out.println("Invoking Airlins details");
}
public String location(String location) {
	return this.location=location;
}
public String revenue(String revenue) {
	return this.revenue=revenue;
}
public float ratings(float ratings) {
	return this.ratings=ratings;
}
public int foundedYear(int foundedYear) {
	return this.foundedYear=foundedYear;
}
public int totalAirlins(int totalAirlins) {
	return this.totalAirlins=totalAirlins;
}
}
