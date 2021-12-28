package com.cosmere.overriding.details;

public class Train extends Transport{
	String name;
	String color;
	byte noOfseats;

	public void travelling() {
		System.out.println("Train is use for travelling");
	}

	public void startBus() {
		System.out.println("Start the Train");
		}
	public void drive() {
		System.out.println("We can drive Train");
	}

	public void stopBus() {
	System.out.println("Stop the Train");
	}
}
