package com.application;

import java.sql.*;

import javax.sql.rowset.Predicate;

public class AddressBean 
{
	private String name,mail,address,city,state,pname;
	private long phoneNumber;
	private int id,price;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber2) {
		this.phoneNumber = phoneNumber2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public boolean validate() 
	{
		String qry="insert into products.address values(?,?,?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and regisrerd");
			 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			
			System.out.println("Connection established");
			
			pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1, name);
			System.out.println("1");
			pstmt.setString(2, mail);
			System.out.println("2");

			pstmt.setLong(3, phoneNumber);
			System.out.println("3");

			pstmt.setString(4, address);
			System.out.println("4");

			pstmt.setString(5, city);
			System.out.println("5");
			System.out.println(" check wether execute updare is exedcuted or not");

		pstmt.setString(6, state);
			System.out.println("6");
			
			pstmt.setInt(7, id);
			System.out.println("7");
			
			pstmt.setString(8, pname);
			System.out.println("8");
			
			pstmt.setInt(9,price);
			System.out.println("9");

			
			int status=pstmt.executeUpdate();
			
			//System.out.println(status);
			if(true)//if(status>0)
				return true;
			else
				return false;
			

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
		//return false;
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		
			
		}
		
		
	}

	
	
	
}
