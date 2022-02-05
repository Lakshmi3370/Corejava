package com.cosmere.crudOperation.operation;

import java.util.ArrayList;

import com.cosmere.crudOperation.dto.BoosterDose;

public interface BoosterDAO {
	
	public boolean save(BoosterDose dto);
	public void getAll();
	public Object updateMobileNumByName(long mobileNum, String name);
    public ArrayList<BoosterDose> getAllByAge(byte age);
    public Object removeByName(String name);

}
