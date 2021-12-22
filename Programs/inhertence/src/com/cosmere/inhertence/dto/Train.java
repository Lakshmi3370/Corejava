package com.cosmere.inhertence.dto;

public class Train {
	String trainName;
	String color;
	int trainNum;
	String route;
	float trainFair;
	
	public Train() {
		System.out.println("Invoking Train details");
	}
	public String trainName(String trainName) {
		return this.trainName=trainName;
	}
	public String color(String color) {
		return this.color=color;
	}
	public int trainNum(int trainNum) {
		return this.trainNum=trainNum;
	}
	public String route(String route) {
		return this.route=route;
	}
	
	public float trainFair(float trainFair) {
		return this.trainFair=trainFair;
	}

}
