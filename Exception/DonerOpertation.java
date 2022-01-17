package com.cosmere.enums.dao;

import com.cosmere.enums.dto.BloodGroup;
import com.cosmere.enums.dto.DonerDTO;
import com.cosmere.enums.dto.Gender;

public class DonerOpertation {
	
DonerDTO[] doner = new DonerDTO[5];
int index = 0;

public void save(DonerDTO name) {
	if(index<doner.length) {
		index++;
	}
}
	public String getAll(DonerDTO[] dto) {
		if(doner.length == dto.length) {
			doner =dto;
			return "get the value";
		}
		return "not get the value";
	}
	public String add(DonerDTO name) {
		if(index<doner.length) {
			doner[index]=name;
			index++;
			return "add the value";
		}
		return "not add the value";
	}
	public void printAll() {
		for(int index=0; index<doner.length; index++) {
			if(doner[index]!=null) {
				System.out.println(doner[index].toString());
			}
		}
	}
	public DonerDTO getBg(BloodGroup bg) {
		for(int index=0; index<doner.length; index++) {
if(bg.equals(doner[index].getBg())) {
	return doner[index];
}
	}
		return null;
		}
public DonerDTO getByGender(Gender gender) {
	for(int index=0; index<doner.length; index++) {
		if(doner[index]!=null) {
		if(gender.equals(doner[index].getGender())) {
			return doner[index];
}
	}
	}
return null;
}
public DonerDTO updateContactByName(String name, long contactNum) {
	for(int index=0; index<doner.length; index++) {
		if(name.equals(doner[index].getName())) {
			return doner[index];
		}
}
	return null;
}public DonerDTO[] getByAllGender(Gender gender) {
	int i = 0;
	DonerDTO[] dtos = new DonerDTO[doner.length];
	for(int index=0; index<doner.length; index++) {
if(doner[index]!=null) {
	if(gender.equals(doner[index].getGender())) {
dtos[i]=doner[index];
i++;
}	
  }
	}
return dtos;
}
public DonerDTO[] getByAllBg(BloodGroup bg) {
	int j = 0;
	DonerDTO[] dtos1 = new DonerDTO[doner.length];
	for(int index=0; index<doner.length; index++) {
		if(doner[index]!=null) {
			if(bg.equals(doner[index].getBg())) {
				dtos1[j]=doner[index];
              j++;
		}
		}
}
	return dtos1;
}
}




