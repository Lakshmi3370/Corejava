package com.cosmere.jewellery.operation;

import com.cosmere.jewellery.dto.JewelleryDTO;

public interface JewelleryDAO {
	
	public String add(JewelleryDTO dto);
	public void printAll();
	public JewelleryDTO updatePriceByPurity(float purity, int price);
	public JewelleryDTO updateJewelleryNameByDesign(String design, String jewelleryName);
	public JewelleryDTO getByGrams(float grams);
	public boolean deleteByPrice(int price);
	
}
