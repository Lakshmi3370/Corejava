package com.cosmere.trainee.dto;

public class AddressDTO {
	private String buildingNum;
	private AreaDTO area;
	
	public void setBuildingNum(String buildingNum) {
		this.buildingNum=buildingNum;
	}
	public String getBuildingNum() {
		return buildingNum;
	}
	public void setArea(AreaDTO area) {
		this.area=area;
	}
	public AreaDTO getArea() {
		return area;
	}
	public String getAll() {
		return buildingNum+"\t "+area;
	
	}
}
