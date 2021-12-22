package com.cosmere.inhertence.dto;

public class Employee extends Developer {
String name;
byte id;
double salary;
long contactNum;
char gender;

public Employee() {
	this("Shilpa");
	System.out.println("Invoking Employee details");
}

public Employee(String name) {
	super(560010);
System.out.println(name);
}

public String name(String name) {
	return this.name=name;
}
public byte id(byte id) {
	return this.id=id;
}
public double salary(double salary) {
	return this.salary=salary;
}
public long contactNum(long contactNum) {
	return this.contactNum=contactNum;
}
public char gender(char gender) {
	return this.gender=gender;
}
}
