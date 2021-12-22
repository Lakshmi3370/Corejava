package com.cosmere.inhertence.dto;

public class Xworkz extends Institute {
String address;
int noOfStudents;
byte noOfclassRooms;
String course;
short noOfBranches;

public Xworkz() {
	System.out.println("Invoking Xworkz details");
	}
public String address(String address) {
	return this.address=address;
}
public int noOfStudents(int noOfStudents) {
	return this.noOfStudents=noOfStudents;
}
public byte noOfclassRooms(byte noOfclassRooms) {
	return this.noOfclassRooms=noOfclassRooms;
}
public String course(String course) {
	return this.course=course;
}
public short noOfBranches(short noOfBranches) {
	return this.noOfBranches=noOfBranches;
}

}
