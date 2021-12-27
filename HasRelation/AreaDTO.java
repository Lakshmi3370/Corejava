package com.cosmere.trainee.dto;

public class AreaDTO {
	private String areaName;
	private DistrictDTO district;
	
	public void setAreaName(String areaName) {
		this.areaName=areaName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setDistrict(DistrictDTO district) {
		this.district=district;
	}
	public DistrictDTO getDistrict() {
		return district;
	}
	public String getAll() {
		return areaName+"\t "+district;
	
	}
}
