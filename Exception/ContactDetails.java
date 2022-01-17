package com.cosmere.enums.dto;

public class ContactDetails {
private long contactNum;
private String email;
private String address;

public void setContactNum(long contactNum) {
this.contactNum=contactNum;
}
public long getContactNum() {
	return contactNum;
}
public void setEmail(String email) {
this.email=email;
}
public String getEmail() {
	return email;
}
public void setAddress(String address) {
this.address=address;
}
public String getAddress() {
	return address;
}
public String toString() {
	return getClass().getSimpleName()+ contactNum+ "\t "+ email+ "\t "+ address;
}

}
