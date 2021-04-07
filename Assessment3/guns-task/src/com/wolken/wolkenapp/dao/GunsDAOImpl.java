package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.wolken.wolkenapp.connection.Connect;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsDAOImpl implements GunsDAO{

	@Override
	public void add(GunsDTO gunsdto) {
		// TODO Auto-generated method stub

	try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("insert into wolken.gunstask values(?,?,?,?,?,?,?,?)");){
				ps.setInt(1, gunsdto.getGunsId());
				ps.setString(2, gunsdto.getGunsName());
				ps.setDouble(3, gunsdto.getPrice());
				ps.setString(4, gunsdto.getSerialNo());
				ps.setString(5, gunsdto.getBrandName());
				ps.setString(6, gunsdto.getType());
				ps.setString(8, gunsdto.getMadeIn());
				ps.setInt(7, gunsdto.getNoOfBullet());
				System.out.println("Data Added");
				ps.executeUpdate();
				ps.close();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in add daoimpl");
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("select * from wolken.gunstask");){
				try(ResultSet rs = ps.executeQuery();){
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						double price = rs.getDouble(3);
						String sn  = rs.getString(4);
						String brand = rs.getString(5);
						String type = rs.getString(6);
						int bullets = rs.getInt(7);
						String made = rs.getString(8);
						System.out.println(name+" "+price+" "+sn + " "+ brand+" "+type+" "+bullets+" "+made );
						System.out.println("Data Displayed");
					}
				}
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void updatebysn(String sn, String name) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("update wolken.gunstask set name = ? where sn = ?");){
				ps.setString(1, name);
				ps.setString(2, sn);
				ps.executeUpdate();
				ps.close();
				System.out.println("Data Updated");
			}
			con.close();
			}
		
		
		
	}

	@Override
	public void deletebyId(int id) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("delete * from wolken.gunstask where id = ?");){
				ps.setInt(1, id);
				ps.executeUpdate();
				ps.close();
				System.out.println("Data deleted");
				}
			}
		
	}

	@Override
	public void getAllbyBrand(String brandName) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("select * from wolken.gunstask where brand = ?");){
				try(ResultSet rs = ps.executeQuery();){
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						double price = rs.getDouble(3);
						String sn  = rs.getString(4);
						String brand = rs.getString(5);
						String type = rs.getString(6);
						int bullets = rs.getInt(7);
						String made = rs.getString(8);
						System.out.println(name+" "+price+" "+sn + " "+ brand+" "+type+" "+bullets+" "+made );
						System.out.println("data fetched");
					}
				}}}
	}
		

	@Override
	public void getAllbyCountry(String country) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection con = Connect.getConnect()){
			try (PreparedStatement ps = con.prepareStatement("select * from wolken.gunstask where made = ?");){
				try(ResultSet rs = ps.executeQuery();){
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						double price = rs.getDouble(3);
						String sn  = rs.getString(4);
						String brand = rs.getString(5);
						String type = rs.getString(6);
						int bullets = rs.getInt(7);
						String made = rs.getString(8);
						System.out.println(name+" "+price+" "+sn + " "+ brand+" "+type+" "+bullets+" "+made );
						System.out.println("Data fetched by country");
					}
				}
		
			}
	}
	}}
