package com.wolken.wolkenapp.dto;

public class MobileDTO {
	private String mobileId;
	private String  modelName;
	private String brandName;
	private double price;
	private int NoOfCamera;
	private String serialNo;
	private double memeory;
	public String getMobileId() {
		return mobileId;
	}
	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}

	
	public int getNoOfCamera() {
		return NoOfCamera;
	}
	public void setNoOfCamera(int noOfCamera) {
		NoOfCamera = noOfCamera;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public double getMemeory() {
		return memeory;
	}
	public void setMemeory(double memeory) {
		this.memeory = memeory;
	}
	public void setPrice(double price2) {
		// TODO Auto-generated method stub
		
	}
	

}
