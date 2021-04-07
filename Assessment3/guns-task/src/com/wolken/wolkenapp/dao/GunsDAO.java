package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsDAO {
 public void add(GunsDTO gunsdto);
 public void display();
 public void updatebysn(String sn , String name) throws SQLException;
 public void deletebyId(int id) throws SQLException;
 public void getAllbyBrand(String brandName) throws SQLException;
 public void getAllbyCountry(String country) throws SQLException;
}
