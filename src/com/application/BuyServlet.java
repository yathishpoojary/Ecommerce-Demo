package com.application;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class BuyServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	System.out.println(" Buy servlet executed");
	String pId=req.getParameter("pro");
	String pCount=req.getParameter("count");
	System.out.println(pId);
	System.out.println(pCount);
	int id=Integer.parseInt(pId);
	ProductBean b=new ProductBean();
	b.productDetails(id);
	int count=Integer.parseInt(pCount);
	
	
	int price=b.getPrice();
	int totalAmount=price*count;
	
	System.out.println(totalAmount);
	req.setAttribute("b", b);
	req.setAttribute("totalAmount", totalAmount);
	RequestDispatcher rd=req.getRequestDispatcher("jsp/buy.jsp");
	rd.forward(req, resp);
	
}
}
