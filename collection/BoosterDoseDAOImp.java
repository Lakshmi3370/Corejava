package com.cosmere.crudOperation.operation;

import java.util.ArrayList;
import java.util.Collections;

import com.cosmere.crudOperation.dto.BoosterDose;

public class BoosterDoseDAOImp implements BoosterDAO{
	
	ArrayList<BoosterDose> arraylist = new ArrayList<BoosterDose>();

	@Override
	public boolean save(BoosterDose dto) {
		return arraylist.add( dto);
		 
	}

	@Override
	public void getAll() {
     for(BoosterDose list : arraylist) {
    	 System.out.println(list.toString());
     }
	}

	@Override
	public Object updateMobileNumByName(long mobileNum, String name) {
		for(BoosterDose list : arraylist) {
			if(name.equals(list.getName())) {
				list.setMobileNum(mobileNum);
				return list;
			}
		}
		return arraylist;
	}

	@Override
	public ArrayList<BoosterDose> getAllByAge( byte age) {
		ArrayList<BoosterDose> dtos = new ArrayList<BoosterDose>();
		for(BoosterDose list : arraylist) {
			if(age==list.getAge()) {
				return arraylist;
			}
			}
		
		return dtos;
	}

	@Override
	public Object removeByName(String name) {
		for(BoosterDose list : arraylist) {
			if(name.equals(list.getName())) {
				return arraylist.remove(list);
			}
	}
		return null;
	}

}
