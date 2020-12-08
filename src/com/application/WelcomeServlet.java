package com.application;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Blob;

public class WelcomeServlet
{
	
	private int id,price;
	private String name,details;

	private java.sql.Blob image;
public	void	display()
		{
	String qry="select * from products.Product";
	Connection con=null;
	PreparedStatement pstmt=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver class is loaded and regisrerd in ProductBean class");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
		// TODO Auto-generated catch block
		System.out.println("Connection established in ProductBean class");
		pstmt=con.prepareStatement(qry);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			id=rs.getInt(1);
			name=rs.getString(2);
			details=rs.getString(3);
			//image=rs.getBlob(4);
			//FileOutputStream fout=new FileOutputStream("");  
			
			
			System.out.println(price);
			
		}
			
		
		
	}catch (Exception e) 
	{
		// TODO: handle exception
		e.printStackTrace();
		}
		}
	public int getId() {
		return id;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getDetails() {
		return details;
	}
	public java.sql.Blob getImage() {
		return image;
	}
		
}
