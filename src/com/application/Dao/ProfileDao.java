package com.application.Dao;
import java.sql.*;
import com.application.bean.ProfileBean;

public class ProfileDao 
{
	
	

	public void addDetails(ProfileBean bean)
	{
			Connection con=null;
			PreparedStatement pstmt=null;
			String qry="insert into products.Product values(?,?,?,?,?)";
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver class is loaded and regisrerd");
			 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			
			System.out.println("Connection established");
			
			pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1, bean.getUserName());
			System.out.println("This is in ProfileDao 1");
			
			
			pstmt.setString(2, bean.getMail());
			System.out.println("This is in ProfileDao 2");
			pstmt.setLong(3, bean.getPhoneNumber());
			System.out.println("This is in ProfileDao 3");
			pstmt.setString(4, bean.getPassword());
			System.out.println("This is in ProfileDao 4");
			pstmt.setString(5, bean.getName());
			System.out.println("This is in ProfileDao 5");		
			
			System.out.println(" check wether execute updare is exedcuted or not");
			
			pstmt.executeUpdate();
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public Boolean isLogIn(ProfileBean bean) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String qry = "select username from products.frofile where phoneNumber=? &password=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and regisrerd");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			System.out.println("Connection established");
			pstmt=con.prepareStatement(qry);
			pstmt.setLong(1, bean.getPhoneNumber());
			pstmt.setString(2, bean.getPassword());
			rs=pstmt.executeQuery();
			if(rs!=null)
				return true;
			else
				return false;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
		
		
	}
	
}
