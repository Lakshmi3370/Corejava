package com.cosmere.inhertence.dto;

public class Forest {
String name;
String loaction;
String state;
int animals;
int birds;

public Forest() {
	System.out.println("Invoking Forest details");
}
public String name(String name) {
	return this.name=name;
}
public String loaction(String loaction) {
	return this.loaction=loaction;
}

public String state(String state) {
	return this.state=state;
}
public int animals(int animals) {
	return this.animals=animals;
}
public int birds(int birds) {
	return this.birds=birds;
}
}
