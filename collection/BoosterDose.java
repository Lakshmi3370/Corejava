package com.cosmere.crudOperation.dto;

public class BoosterDose {
	
	private String name;
	private long adharNum;
	private String emailId;
	private long mobileNum;
	private byte age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
public long getAdharNum() {
	return adharNum;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getEmailId() {
	return emailId;
}
public void setMobileNum(long mobileNum) {
	this.mobileNum = mobileNum;
}
public long getMobileNum() {
	return mobileNum;
}
public void setAge(byte age) {
	this.age = age;
}
public byte getAge() {
	return age;
}
@Override
public String toString() {
	return getClass().getSimpleName()+ " Name:"+name+ " \tAdhar Number:"+adharNum+
			" \tEmail Id:"+emailId+ " \tMob No.:"+mobileNum+ " \t Age"+age;
			
}
}
