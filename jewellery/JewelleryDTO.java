package com.cosmere.jewellery.dto;

public class JewelleryDTO {

	private String metalType;
	private float purity;
	private String jewelleryName;
	private int price;
	private String color;
	private float grams;
	private String carat;
	private String design;
	
	public void setMetalType(String metalType) {
		this.metalType = metalType;
	}
	public String getMetalType() {
		return metalType;
	}
	public void setPurity(float purity) {
		this.purity=purity;
	}
	public float getPurity() {
		return purity;
	}
	public void setJewelleryName(String jewelleryName) {
		this.jewelleryName = jewelleryName;
	}
	public String getJewelleryName() {
		return jewelleryName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setGrams(float grams) {
		this.grams = grams;
	}
	public float getGrams() {
		return grams;
	}
	public void setCarat(String carat) {
		this.carat = carat;
	}
	public String getCarat() {
		return carat;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	public String getDesign() {
		return design;
	}
	@Override
	public String toString() {
		return " [" +getClass().getSimpleName()+"] => "+ " MetalType: "+ metalType+ "\t Purity: "+purity+ "\t JewelleryName: "+jewelleryName+ "\t Price: "+
	price+ "\t Color: "+color+ "\t Grams: "+grams+ "\t Carat: "+carat+ "\t Design: "+design;
	}
}
