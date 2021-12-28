package com.cosmere.overriding.details;

public class Flight extends Transport {

	String name;
	byte noOfSeats;
	short length;
	int cost;

	public void travelling() {
		System.out.println("Flight is use for travelling");
		}
	public void drive() {
		System.out.println("We can drive flight");
}
	}
