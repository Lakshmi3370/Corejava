package com.cosmere.inhertence.dto;

public class Metro extends Train {
String station;
int noOfseats;
byte passangers;
String color;
float metroFair;

public Metro() {
	System.out.println("Invoking Metro details");
}
public String station(String station) {
	return this.station=station;
}
public int noOfseats(int noOfseats) {
	return this.noOfseats=noOfseats;
}
public byte passangers(byte passangers) {
	return this.passangers=passangers;
}
public String color(String color) {
	return this.color=color;
}
public float metroFair(float metroFair) {
	return this.metroFair=metroFair;
}
}


