package com.cosmere.trainee.dto;

public class DistrictDTO {
	private String districtName;
	private TalukDTO taluk;
	
	public void setDistrictName(String districtName) {
		this.districtName=districtName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setTaluk(TalukDTO taluk) {
		this.taluk=taluk;
	}
	public TalukDTO getTaluk() {
		return taluk;
	}
	public String getAll() {
		return districtName+"\t "+taluk;
	
	}
}
