package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public class MobileDAOImpl implements MobileDAO{
	public MobileDTO[] mobileDTO;
	int i = 0;

	
	public MobileDAOImpl(int size) {
		mobileDTO = new MobileDTO[size];
	}
	
	
	@Override
	public boolean addMobile(MobileDTO mobileDTO) {

		if (mobileDTO != null) {
			this.mobileDTO[i++] = mobileDTO;
			return true;
		} else
			return false;
	}
	
	
	@Override
	public void getAll() {
		for (int i = 0; i < mobileDTO.length; i++) {
			try {
			System.out.println("Brand Name: " + mobileDTO[i].getBrandName() + "\nMemory: " + mobileDTO[i].getMemeory()
					+ "\nMobile ID: " + mobileDTO[i].getMobileId() + "\nModel Name: " + mobileDTO[i].getModelName()
					+ "\nNumber of Camera: " + mobileDTO[i].getNoOfCamera() + "\nPrice: " + mobileDTO[i].getPrice()
					+ "\nSerial Number: " + mobileDTO[i].getSerialNo() + "\n");
			}
			catch(NullPointerException n){
				System.out.println("Caught null value while trying to display"+ n);
			}
		}
	}

	
	@Override
	public MobileDTO deleteMobileByMobileId(String mobileId) {
		MobileDTO found;
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getMobileId().equals(mobileId)) {
					found = this.mobileDTO[i];
					this.mobileDTO[i] = null;
					System.out.println("\nMobile successfully deleted");
					return found;

				}
			} else {
				System.out.println("Mobile ID could not be found");
				return null;
 
			}
		}
		return null;
	}

	@Override
	public void updateMemoryBySerialNumber(String serialNumberToBeUpdated, double memory) {
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getSerialNo().equalsIgnoreCase(serialNumberToBeUpdated) ) {
					this.mobileDTO[i].setMemeory(memory);
					System.out.println("Memory successfully updated");

				} else
					System.out.println("Serial number of Mobile not found");

			}
		}
	}
	
	@Override
	public void getAllByBrandName(String brandName) throws MobileException {
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getBrandName().equalsIgnoreCase(brandName)) {
					System.out.println("Brand Name: " + mobileDTO[i].getBrandName() + "\nMemory: "
							+ mobileDTO[i].getMemeory() + "\nMobile ID: " + mobileDTO[i].getMobileId() + "\nModel Name: "
							+ mobileDTO[i].getModelName() + "\nNumber of Camera: " + mobileDTO[i].getNoOfCamera()
							+ "\nPrice: " + mobileDTO[i].getPrice() + "\nSerial Number: "
							+ mobileDTO[i].getSerialNo() + "\n");

				}else 
					System.out.println("MobileId could not be found");
			
			}
			else {
				//System.out.println("You have entered a brand which does not exist");
				throw new MobileException();
				
			}

		}
	}

}
