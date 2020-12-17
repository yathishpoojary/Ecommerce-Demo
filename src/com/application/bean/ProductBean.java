package com.application.bean;
import java.io.*;
import java.sql.*;
public class ProductBean 
{	
	private int id1,price;
	private String name;
	private String details;
	byte[]   image1;
	  public byte[] getImage1() {
		return image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}


	private Blob image;
	  public Blob image() {
	        return image;
	    }
	 
	    public void image(Blob image) {
	        this.image = image;
	    }
	  
	      public void  productDetails(int id)
	      {
		
		String qry="select * from products.Product where id=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class is loaded and regisrerd in ProductBean class");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			// TODO Auto-generated catch block
			System.out.println("Connection established in ProductBean class");
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1, id);
			 rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				id1=rs.getInt(1);
				name=rs.getString(2);
				details=rs.getString(3);
	                 
	                System.out.println("image1 "+image1);
				 
				 price=rs.getInt(5);
				System.out.println("Product id in loop "+id);
			}
			
			
		
			
		} catch (ClassNotFoundException | SQLException e)
		{

			e.printStackTrace();
		}
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
			if (rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
		}
	}
	     

	public String getName() {
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getId() {
		return id1;
	}
	public void setId(int id1)
	{
		
		this.id1=id1;
		System.out.println("its in set id"+id1);
	}

	
}

