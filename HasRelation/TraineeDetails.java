package com.cosmere.trainee.dto;

public class TraineeDetails {
	private String name;
	private long contactNum;
	private String emailId;
	private AddressDTO address;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setContactNum(long contactNum) {
		this.contactNum=contactNum;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setAddress(AddressDTO address) {
		this.address=address;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public String getAll() {
		return name+"\t "+contactNum+"\t "+emailId+"\t "+"\t "+address;
	
	}
	
		
	}
	
	
	

