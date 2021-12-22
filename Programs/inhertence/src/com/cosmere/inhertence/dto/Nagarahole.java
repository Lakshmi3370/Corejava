package com.cosmere.inhertence.dto;

public class Nagarahole extends Forest {
String type;
String place;
String state;
String country;
double distanceFromBangalore;

public Nagarahole() {
	System.out.println("Invoking Nagarahole details");
}
public String type(String type) {
	return this.type=type;
}
public String place(String place) {
	return this.place=place;
}

public String state(String state) {
	return this.state=state;
}
public String country(String country) {
	return this.country=country;
}
public double distanceFromBangalore(double distanceFromBangalore) {
	return this.distanceFromBangalore=distanceFromBangalore;
}
}

