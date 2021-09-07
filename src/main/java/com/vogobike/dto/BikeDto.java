package com.vogobike.dto;

import lombok.Data;

@Data
public class BikeDto {

	private String bikeModelName;
	private String manufacture;
	private double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
