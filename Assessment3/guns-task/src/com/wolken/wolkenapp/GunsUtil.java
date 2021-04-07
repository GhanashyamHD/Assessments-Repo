package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.dto.GunsDTO;
import com.wolken.wolkenapp.service.GunsServiceImpl;
import com.wolken.wolkenapp.service.GunsSevice;

public class GunsUtil {
	public static void main(String[] args) {

	GunsSevice gs = new GunsServiceImpl();
	GunsDTO gunsdto = new GunsDTO();
	//Systemt.println("enter id");
	while(true) {
	Scanner sc1 = new Scanner(System.in);
	
    System.out.println("\nSelect an Option \n1=Add\n2=Display\n3=UpdateBySerialNo\n4=DeleteById\n5=GetByBrand\n6=getAllbyCountry\n");
    int opt = sc1.nextInt();
	switch(opt) {
	case 1: System.out.println("enter id");
     Scanner sc = new Scanner(System.in);
	gunsdto.setGunsId(sc.nextInt());
	System.out.println("enter name");
	gunsdto.setGunsName(sc.next());
	System.out.println("enter brandName");
	gunsdto.setBrandName(sc.next());
	System.out.println("enter price");
	gunsdto.setPrice(sc.nextDouble());
	System.out.println("enter type");
	gunsdto.setType(sc.next());
	System.out.println("enter no of bullets");
	gunsdto.setNoOfBullet(sc.nextInt());
	System.out.println("enter made in");
	gunsdto.setMadeIn(sc.next());
    System.out.println("enter serial no");
    gunsdto.setSerialNo(sc.next());
    gs.validateAndAdd(gunsdto);
	case 2: gs.ValidateandgetAll();
	case 3:System.out.println("Enter the serial number \nEnter the new name");
	String newSerial = sc1.next();
	String newname = sc1.next();
	gs.validateandUpdateBySerialNo(newSerial, newname);
	case 4: System.out.println("Enter the id to be deleted");
	   int id = sc1.nextInt();
	   gs.validateandDeletebyId(id);
	case 5: System.out.println("Enter the brand to get its details");
	String brand = sc1.next();
	 gs.validateandGetByBrandname(brand);
	case 6: System.out.println("Enter the country to get its details");
	String con = sc1.next();
	gs.validateandGetallByCountry(con);
  
	}
	}
	}
}
