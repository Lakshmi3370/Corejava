package com.cosmere.jewellery;

import com.cosmere.jewellery.dto.JewelleryDTO;
import com.cosmere.jewellery.operation.JewelleryDAOImp;

public class TestJewellery {

	public static void main(String[] args) {

		JewelleryDTO dto = new JewelleryDTO();
		dto.setMetalType("Gold");
		dto.setPurity(96.0f);
		dto.setJewelleryName("Neck Chain");
		dto.setPrice(55000);
		dto.setColor("Golden");
		dto.setGrams(10.5f);
		dto.setCarat("22k");
		dto.setDesign("Temple Jewellery");
		
		JewelleryDTO dto1 = new JewelleryDTO();
		dto1.setMetalType("Diamond");
		dto1.setPurity(99.87f);
		dto1.setJewelleryName("Ring");
		dto1.setPrice(37000);
		dto1.setColor("White");
		dto1.setGrams(2.5f);
		dto1.setCarat("14k");
		dto1.setDesign("Motif");
		
		JewelleryDTO dto2 = new JewelleryDTO();
		dto2.setMetalType("Platinum");
		dto2.setPurity(99.8f);
		dto2.setJewelleryName("Earings");
		dto2.setPrice(90000);
		dto2.setColor("Silver_color");
		dto2.setGrams(3.56f);
		dto2.setCarat("1 carat");
		dto2.setDesign("Jean Platinum");
		
		JewelleryDAOImp dao = new JewelleryDAOImp();
		
		String res = dao.add(dto);
		System.out.println(res);
		String res1 = dao.add(dto1);
		String res2 = dao.add(dto2);
		
		System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
		
		dao.printAll();
		
		System.out.println();
		
		System.out.println("Updated price by Purity");
		JewelleryDTO result= dao.updatePriceByPurity(96.0f, 50000);
		  System.out.println(result);
		
		System.out.println();
		
		System.out.println("Updated JewelleryName by Design");
		JewelleryDTO result1= dao.updateJewelleryNameByDesign("Motif", "Bangales");
	    System.out.println(result1);

	    
		System.out.println();

		System.out.println("Get by Grams");
		JewelleryDTO result2= dao.getByGrams(10.5f);
		
		System.out.println();
		
		System.out.println("Delete by Price");
		boolean result3= dao.deleteByPrice(90000);
		System.out.println(result3);
	
	}

}
