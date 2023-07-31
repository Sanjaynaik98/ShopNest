package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopNest.product.Product;

public class DataFetcher {
	public static String fetchPass( String uname) {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		String query="select PASS from CUSTOMERS where UNAME=?";
		String dbpass="";
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url,user,pass);
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,uname);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			dbpass=rs.getString("PASS");
		}
		catch (Exception e) {
			System.out.println("Login issues" );
			e.printStackTrace();
		}
		return dbpass;
	}
	public static List fetchUserInfo() {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String query="select UNAME,MAIL,GENDER,ADDRESS from CUSTOMERS";
		List ulist=new ArrayList();
		try {
			Class.forName(path);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
				ulist.add(temp);
			}
		}
		catch (Exception e) {
			System.out.println("Problem in login");
			e.printStackTrace();
		}
		return ulist;
	}
	public static List viewProduct() {
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String query="select PID,PNAME,PDESC,PRICE,PIMG from PRODUCTS";
		List plist=new ArrayList();
		try {
			Class.forName(path);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				String temp=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4)+":"+rs.getString(5);
				plist.add(temp);
			}
		}
		catch (Exception e) {
			System.out.println("Problem in viewing");
			e.printStackTrace();
		}
		return plist;

		
	}
	public static Product getProductById(int pid) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		String sql="SELECT pname,price FROM products WHERE pid=?";
		Product p=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			rs.next();
			String pname=rs.getString(1);
			int price=rs.getInt(2);
			
			p=new Product(pid,pname,price);
		}catch(Exception e){
			System.out.println("Problem in fetching product by id");
			e.printStackTrace();
		}			
		finally {
			return p;
		}
	}
}
