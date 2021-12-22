package com.cosmere.inhertence.dto;

public class Indigo extends Airlins {
	String location;
	String color;
	int ticketFair;
	int noOfSeats;
	int passanger;
	public Indigo() {
		System.out.println("Invoking Indigo details");
	}
	public String location(String location) {
		return this.location=location;
	}
	public String color(String color) {
		return this.color=color;
	}
	public int ticketFair(int ticketFair) {
		return this.ticketFair=ticketFair;
	}
	public int noOfSeats(int noOfSeats) {
		return this.noOfSeats=noOfSeats;
	}
	public int passanger(int passanger) {
		return this.passanger=passanger;
	}
}
