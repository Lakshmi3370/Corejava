package com.cosmere.trainee.dto;

public class TalukDTO {
	private String talukName;
	private StateDTO state;
	
	public void setTalukName(String talukName) {
		this.talukName=talukName;
	}
	public String getName() {
		return talukName;
	}
	public void setState(StateDTO state) {
		this.state=state;
	}
	public StateDTO getState() {
		return state;
	}
	public String getAll() {
		return talukName+"\t "+state;
	
	}
}
