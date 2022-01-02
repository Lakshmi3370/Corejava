package com.cosmere.gun;

import com.cosmere.gun.details.BulletDTO;
import com.cosmere.gun.details.GunDetails;
import com.cosmere.gun.details.SizeDTO;
import com.cosmere.gun.details.TypeDTO;
import com.cosmere.gun.operation.GunOperation;

public class TestGun {

	public static void main(String[] args) {
		
		GunDetails gun = new GunDetails();
		gun.setName("Hawken Rifle");
		gun.setColor("Black");
		gun.setPrice(30989.00);
		gun.setType(TypeDTO.AK_47);
		
		GunDetails gun1 = new GunDetails();
		gun1.setName("Weatherby Mark V");
		gun1.setColor("Brown with Black");
		gun1.setPrice(45000.00);
		gun1.setType(TypeDTO.BOLTACTION_RIFELS);

		
		GunDetails gun2 = new GunDetails();
		gun2.setName("A.H. Fox");
		gun2.setColor("Brown");
		gun2.setPrice(34888.54);
		gun2.setType(TypeDTO.PISTOL);

		
		GunDetails gun3 = new GunDetails();
		gun3.setName("TarHunt RSG");
		gun3.setColor("Red");
		gun3.setPrice(43229.00);
		gun3.setType(TypeDTO.SNIPERS);

		SizeDTO size = new SizeDTO();
		size.setLength(10.77f);
		size.setWeight(8.7f);
		
		SizeDTO size1 = new SizeDTO();
		size1.setLength(14.5f);
		size1.setWeight(4.0f);
		
		SizeDTO size2 = new SizeDTO();
		size2.setLength(30.00f);
		size2.setWeight(5.3f);
		
		SizeDTO size3 = new SizeDTO();
		size3.setLength(33.00f);
		size3.setWeight(7.44f);
		
		BulletDTO bullet = new BulletDTO();
		bullet.setGrams((byte)7);
		bullet.setMm((byte)9);
		bullet.setCost(599.00f);
		
		BulletDTO bullet1 = new BulletDTO();
		bullet1.setGrams((byte)5);
		bullet1.setMm((byte)7);
		bullet1.setCost(478.4f);
		
		BulletDTO bullet2 = new BulletDTO();
		bullet2.setGrams((byte)9);
		bullet2.setMm((byte)8);
		bullet2.setCost(354.80f);
		
		BulletDTO bullet3 = new BulletDTO();
		bullet3.setGrams((byte)5);
		bullet3.setMm((byte)11);
		bullet3.setCost(240.00f);
		
		GunOperation operation = new GunOperation();
		String res = operation.save(gun);
		String res1 = operation.save(gun1);
		String res2 = operation.save(gun2);
		String res3 = operation.save(gun3);
		operation.printAll();
		System.out.println();
		
		System.out.println("Get All By Types");
		GunDetails[] type = operation.getAllByType(TypeDTO.BOLTACTION_RIFELS);
		for (int i = 0; i<type.length; i++) {
			System.out.println(type[i]);
			operation.printAll();
			System.out.println();	
		}
		
		System.out.println("Get All By Names");
		GunDetails[] name = operation.getAllByName("Hawken Rifle");
		for (int j = 0; j<name.length;j++) {
			System.out.println(name[j]);
			operation.printAll();
			System.out.println();
	}
		System.out.println("Get By Length");
		GunDetails[] len = operation.getByLength(33.0f);
		for (int k = 0; k<len.length; k++) {
			System.out.println(len[k]);
			operation.printAll();
			System.out.println();
			}
		
		System.out.println("Update Price By Name");
		GunDetails resp = operation.updatePriceByName("Weatherby Mark V",30000.00);
		System.out.println(resp);
		operation.printAll();
		System.out.println();
		
		System.out.println("Update Mm By Cost");
		GunDetails resp1 = operation.updateMmByCost(240.00f,(byte)11);
		System.out.println(resp1);
		operation.printAll();
		System.out.println();
	
	System.out.println("Delete By Name");
	GunDetails resp2 = operation.deleteByName("A.H. Fox");
	System.out.println(resp2);
	operation.printAll();
	}
	
}

