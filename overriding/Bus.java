package com.cosmere.overriding.details;

public class Bus extends Transport{
String name;
String color;
byte noOfseats;

public void travelling() {
	System.out.println("Bus is use for travelling");
}

public void startBus() {
	System.out.println("Start the Bus");
	}
public void drive() {
	System.out.println("We can drive bus");
}

public void stopBus() {
System.out.println("Stop the Bus");
}
}
