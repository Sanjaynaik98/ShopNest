package com.shopNest.dbHandler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInjector {
	
	
	public static String addCustomer(String username,String email,String password,String gender,String address) {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		String query="insert into CUSTOMERS values(?,?,?,?,?)";
		String regStatus="";
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,user,pass);
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, gender);
			pstmt.setString(5, address);
			pstmt.executeUpdate();
			regStatus="success";
		}
		catch (Exception e) {
			System.out.println("Problem in adding customer");
			e.printStackTrace();
			regStatus="fail";
		}
		finally {
			return regStatus;
		}
	}
	public static boolean addProduct(int pid,String pname,String pdesc,int pprice,String pimg) {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		String query="insert into PRODUCTS values(?,?,?,?,?)";
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,user,pass);
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, pid);
			pstmt.setString(2, pname);
			pstmt.setString(3, pdesc);
			pstmt.setInt(4, pprice);
			pstmt.setString(5, pimg);
			pstmt.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println("Problem in adding product");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
