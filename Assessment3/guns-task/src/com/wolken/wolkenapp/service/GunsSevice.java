package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsSevice {
	public void validateAndAdd(GunsDTO gunsdto);
	public void ValidateandgetAll();
	public void validateandUpdateBySerialNo(String serialNo , String name);
	public void validateandDeletebyId(int gunId);
	public void validateandGetByBrandname(String brandname);
	public void validateandGetallByCountry(String country);

}
