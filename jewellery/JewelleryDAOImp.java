package com.cosmere.jewellery.operation;

import com.cosmere.jewellery.dto.JewelleryDTO;
import com.cosmere.jewellery.exception.InvalidPriceUpdateException;

public class JewelleryDAOImp implements JewelleryDAO {
	
	JewelleryDTO[] jewellery = new JewelleryDTO[8];
	int index=0;

	@Override
	public String add(JewelleryDTO dto) {
		if(index<jewellery.length) {
			jewellery[index]=dto;
			index++;
			return "Jeweller details are added";
		}
		return "Jeweller details are not addded";
	
	}

	@Override
	public void printAll() {
		for(int index =0; index<jewellery.length; index++) {
			if(jewellery[index]!=null) {
			System.out.println(jewellery[index].toString());
		}
		
	}
	}

	@Override
	public JewelleryDTO updatePriceByPurity(float purity, int price) {
		JewelleryDTO dtos;
		for(int index =0; index<jewellery.length; index++) {
			if(jewellery[index]!=null) {
			if(purity==jewellery[index].getPurity()) {
			jewellery[index].setPrice(price);
			if(price==51000) {
				System.out.println(price+ " Updated valid price");
			}
			else {
				try {
					 throw new InvalidPriceUpdateException();
				}
				catch(InvalidPriceUpdateException e) {
				System.out.println("Invalid price");
			}
			}
			return jewellery[index];

					}
				}
		}
					
		
		return null;
	}

	@Override
	public JewelleryDTO updateJewelleryNameByDesign(String design, String jewelleryName) {
		JewelleryDTO dtos1;
		for(int index =0; index<jewellery.length; index++) {
			if(jewellery[index]!=null) {
				if(design.equals(jewellery[index].getDesign())) {
					jewellery[index].setJewelleryName(jewelleryName);
					return jewellery[index];
			}
		
		}
		}
		return null;
	}

	@Override
	public JewelleryDTO getByGrams(float grams) {
		JewelleryDTO dtos2;
		for(int index =0; index<jewellery.length; index++) {
			if(jewellery[index]!=null) {
				if(grams==jewellery[index].getGrams()) {
					System.out.println(jewellery[index]);
					return jewellery[index];
				}
			}	
			}
		return null;
	}

	@Override
	public boolean deleteByPrice(int price) {
		for(int index =0; index<jewellery.length; index++) {
			if(jewellery[index]!=null) {
				if(price==jewellery[index].getPrice()) {
					return true;
				}
			}
		}
		return false;
	}
}

	
	

	
	


