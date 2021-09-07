package com.vogobike.bo;

import lombok.Data;

@Data
public class BikeBo {
	private int bikeNo;
	private String bikeModelName;
	private String manufacture;
	private String rtaRegistrationNo;
	private double price;
	public int getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBikeModelName() {
		return bikeModelName;
	}
	public void setBikeModelName(String bikeModelName) {
		this.bikeModelName = bikeModelName;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getRtaRegistrationNo() {
		return rtaRegistrationNo;
	}
	public void setRtaRegistrationNo(String rtaRegistrationNo) {
		this.rtaRegistrationNo = rtaRegistrationNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
