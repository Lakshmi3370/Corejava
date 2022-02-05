package com.cosmere.crudOperation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import com.cosmere.crudOperation.dto.BoosterDose;
import com.cosmere.crudOperation.operation.BoosterDoseDAOImp;

public class TestBoosterDose {

	public static void main(String[] args) {

		BoosterDose boosterdose = new BoosterDose();
		
		boosterdose.setName("Raju");
		boosterdose.setAdharNum(903432289977l);
		boosterdose.setEmailId("raju3223@gmail.com");
		boosterdose.setMobileNum(9873421100l);
		boosterdose.setAge((byte)25);
		
	
		BoosterDose boosterdose1 = new BoosterDose();
       
		boosterdose1.setName("Savita");
		boosterdose1.setAdharNum(54949228878l);
		boosterdose1.setEmailId("savita234@gmail.com");
		boosterdose1.setMobileNum(9854321090l);
		boosterdose1.setAge((byte)21);
		
		BoosterDose boosterdose2 = new BoosterDose();
	       
		boosterdose2.setName("Rashmi");
		boosterdose2.setAdharNum(542343390448l);
		boosterdose2.setEmailId("rashmi45@gmail.com");
		boosterdose2.setMobileNum(7834220394l);
		boosterdose2.setAge((byte)24);
		
		BoosterDoseDAOImp dao = new BoosterDoseDAOImp();
		
		boolean res = dao.save(boosterdose);
		boolean res1 = dao.save(boosterdose1);
		boolean res2 = dao.save(boosterdose2);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		

		dao.getAll();

		System.out.println();
		Object update= dao.updateMobileNumByName(7844232390l, "Raju");
		dao.getAll();
		System.out.println(update);
		
		System.out.println();
		System.out.println(dao.getAllByAge((byte)21));
		
		System.out.println();
		Object obj1 = dao.removeByName("Rashmi");
		dao.getAll();
		System.out.println(obj1);

	}

}
