package com.cosmere.trainee.dto;

public class StateDTO {
	private String stateName;
	private String country;
	
	public void setStateName(String stateName) {
		this.stateName=stateName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getCountry() {
		return country;
	}
	public String getAll() {
		return stateName+"\t "+country;
	
	}
}
