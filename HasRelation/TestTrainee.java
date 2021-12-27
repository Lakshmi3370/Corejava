package com.cosmere.trainee;

import com.cosmere.trainee.dto.AddressDTO;
import com.cosmere.trainee.dto.AreaDTO;
import com.cosmere.trainee.dto.DistrictDTO;
import com.cosmere.trainee.dto.StateDTO;
import com.cosmere.trainee.dto.TalukDTO;
import com.cosmere.trainee.dto.TraineeDetails;
import com.cosmere.trainee.operaton.TraineeDAO;

public class TestTrainee {

	public static void main(String[] args) {
		TraineeDetails trainee = new TraineeDetails();
		trainee.setName("John");
		trainee.setContactNum(7019854337l);
		trainee.setEmailId("john56@gmail.com");
	
	AddressDTO addressdto = new AddressDTO();
	addressdto.setBuildingNum("158A");
	
	AreaDTO areadto = new AreaDTO();
	areadto.setAreaName("Rajaji Nagar");
	
	DistrictDTO districtdto = new DistrictDTO();
	districtdto.setDistrictName("Bangalore");

	TalukDTO talukdto = new TalukDTO();
	talukdto.setTalukName("South Bangalore");
	
	StateDTO statedto = new StateDTO();
	statedto.setStateName("Karnataka");
	statedto.setCountry("India");
	
	TraineeDAO dao = new TraineeDAO();
	dao.add(trainee);
	dao.printAll();
	
	TraineeDetails res = dao.updateCountryByName("Rashmi", "Dubai");
	dao.printAll();

	
	TraineeDetails res1 = dao.getByCountry("Tamil Nadu");
	dao.printAll();
	
	TraineeDetails res2 = dao.getByDistrict("Mandya");
	dao.printAll();
}
}