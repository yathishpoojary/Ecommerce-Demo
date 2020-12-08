package com.application;
import java.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.servlet.*;
import javax.servlet.http.*;
public class CartServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("pro"));
		
		
		ProductBean bean=new ProductBean();
		bean.addCart(id);
		String qry="insert into products.cart values(?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class is loaded and regisrerd in ProductBean class");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			// TODO Auto-generated catch block
			System.out.println("Connection established in ProductBean class");
			pstmt=con.prepareStatement(qry);
			
		}catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
	}
}
