package com.cosmere.gun.operation;

import java.util.Iterator;

import com.cosmere.gun.details.GunDetails;
import com.cosmere.gun.details.TypeDTO;

public class GunOperation {
	
	GunDetails[] dto = new GunDetails[5];
	int index = 0;
	
public String save(GunDetails details) {
	if(index<dto.length) {
	dto[index]=details;
	index++;
	return "Details are saved";
	}
	return "Details are not saved";
}
public void printAll() {
	for(int index=0; index<dto.length; index++) {
		System.out.println(dto[index]);
	}
}
public GunDetails[] getAllByType(TypeDTO type) {
	GunDetails[] dto1 = new GunDetails[dto.length];
	int i = 0;
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
			if(type.equals(dto[index].getType())) {
				dto1[i] = dto[index];
				i++;
			}
		}
	}
	return dto1;
}
public GunDetails[] getAllByName(String name) {
	GunDetails[] names = new GunDetails[dto.length];
int j=0;
for(int index=0; index<dto.length; index++) {
	if(dto[index]!=null) {
if(name.equals(dto[index].getName())) {
	names[j]= dto[index];
	j++;
}
	}
}
	return names;
}
public GunDetails[] getByLength(float length) {
	GunDetails[] len = new GunDetails[dto.length];
int k = 0;
for(int index=0; index<dto.length; index++) {
	if(dto[index]!=null) {
		if(length==dto[index].getSize().getLength()) {
			len[k]=dto[index];
			k++;
		}
	}
}
return len;
}
public GunDetails updatePriceByName(String name, double price) {
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
if(name.equals(dto[index].getName())) {
	dto[index].setPrice(price);
	return dto[index];
}
	}

}
	return null;
}
public GunDetails updateMmByCost(float cost, byte mm) {
	for(int index=0; index<dto.length; index++) {
		if(dto[index]!=null) {
if(cost==dto[index].getBullet().getCost()) {
	dto[index].getBullet().setMm(mm);
	return dto[index];
}
}
}
	return null;
}
public GunDetails deleteByName(String gunName) {
	for (int index = 0; index<dto.length; index++) {
		if(dto[index]!=null) {
		if(gunName.equals(dto[index].getName())) {
			dto[index]=null;
		}
		}
		
	}
	return null;
}

} 

