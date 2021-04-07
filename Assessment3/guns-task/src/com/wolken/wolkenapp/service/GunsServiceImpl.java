package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.GunsDAO;
import com.wolken.wolkenapp.dao.GunsDAOImpl;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsServiceImpl implements GunsSevice{
 GunsDAO gd = new GunsDAOImpl();
	@Override
	public void validateAndAdd(GunsDTO gunsdto) {
		// TODO Auto-generated method stub
		try {if(gunsdto.getGunsId()>1)
			if(gunsdto.getGunsName() != null && gunsdto.getGunsName().length() >1)
				if(gunsdto.getPrice() >1)
					if(gunsdto.getSerialNo() != null && gunsdto.getSerialNo().length() >1)
						if(gunsdto.getBrandName() != null && gunsdto.getBrandName().length()>1)
							if(gunsdto.getType() != null && gunsdto.getType().length() >1)
								if(gunsdto.getNoOfBullet() < 1000)
									if(gunsdto.getMadeIn() != null && gunsdto.getMadeIn().length() >1)
										gd.add(gunsdto);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in add serviceimpl");
		}
		}
		
	

	@Override
	public void ValidateandgetAll() {
		// TODO Auto-generated method stub
		try {
			gd.display();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void validateandUpdateBySerialNo(String serialNo , String name) {
		// TODO Auto-generated method stub
	try {
		if(serialNo != null && serialNo.length()>1 && name != null) {
			gd.updatebysn(serialNo, name);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
	}

	@Override
	public void validateandDeletebyId(int gunId) {
		// TODO Auto-generated method stub
		if(gunId > 0 && gunId < 100) {
			try {
				gd.deletebyId(gunId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void validateandGetByBrandname(String brandname) {
		// TODO Auto-generated method stub
		if(brandname != null && brandname.length()>1) {
			try {
				gd.getAllbyBrand(brandname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void validateandGetallByCountry(String country) {
		// TODO Auto-generated method stub
		if(country != null && country.length() >1) {
			try {
				gd.getAllbyCountry(country);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
