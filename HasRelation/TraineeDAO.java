package com.cosmere.trainee.operaton;

import com.cosmere.trainee.dto.TraineeDetails;

public class TraineeDAO {
	TraineeDetails[] dto = new TraineeDetails[3];
	int index =0;
	
	public void add(TraineeDetails trainee) {
		if(index<dto.length) {
			dto[index]=trainee;
			index++;
		}
	}
	public void printAll(){
		for(int index=0; index<dto.length; index++) {
			if(dto[index]!=null) {
			System.out.println(dto[index].getAll());
		}
			
		}
	}
	
public TraineeDetails updateCountryByName(String countryName ,String name) {
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
			if(name.equals(dto[index].getName())) {
				dto[index].getAddress().getArea().getDistrict().getTaluk().getState().setCountry(countryName);
				return dto[index];
			}
	}
	}
	return dto[index];
}


public TraineeDetails getByCountry(String country) {
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
			if(country.equals(dto[index].getAddress().getArea().getDistrict().getTaluk().getState().getCountry())) {
			return dto[index];	
			}
		}
}
	return dto[index];
}
public TraineeDetails getByDistrict(String district) {
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
			if(district.equals(dto[index].getAddress().getArea().getDistrict())) {
				
			return dto[index];	
			}
		}
}
	return dto[index];
}
}


