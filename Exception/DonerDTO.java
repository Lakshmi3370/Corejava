package com.cosmere.enums.dto;

public class DonerDTO {
	private String name;
	private byte age;
	private float weight;
	private BloodGroup bg;
	private Gender gender;
	private ContactDetails details;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	public void setAge(byte age) {
		this.age= age;
	}
	
	public byte getAge() {
		return age;
	}
	public void setWeight(float weight) {
		this.weight= weight;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setBg(BloodGroup bg) {
		this.bg=bg;
	}
	public BloodGroup getBg() {
		return bg;
	}
	
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	public Gender getGender() {
		return gender;
	}
	public void setDetails(ContactDetails details) {
		this.details=details;
	}
	public ContactDetails getDetails() {
		return details;
	}
public String toString() {
	return getClass().getSimpleName()+ name+ "\t " +age+"\t "+weight+"\t "+bg+"\t "+gender+"\t "+details;
}
}



