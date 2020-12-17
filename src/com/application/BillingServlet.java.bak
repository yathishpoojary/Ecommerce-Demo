
package com.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class BillingServlet extends HttpServlet
{
	private int id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("firstname");
		String email=req.getParameter("email");
		String phoneNumber=req.getParameter("number");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String productName=req.getParameter("pname");
		String pId=req.getParameter("id");
		String pprice=req.getParameter("price");
		
		//System.out.println(productName);
		//System.out.println(pId);
		//System.out.println(pprice);
		
		int id=Integer.parseInt(pId);
		int price=Integer.parseInt(pprice);

		AddressBean bean=new AddressBean();
		bean.setName(name);
		bean.setMail(email);
		long PhoneNumber=Long.parseLong(phoneNumber);
		bean.setPhoneNumber(PhoneNumber);
		bean.setAddress(address);
		bean.setCity(city);
		bean.setState(state);
		bean.setPname(productName);
		bean.setId(id);
		bean.setPrice(price);
		
		
		System.out.println("entered billing servlet");
		System.out.println(" bean address is"+bean);
		boolean  b=bean.validate();
		System.out.println(bean.getName());
		System.out.println(b);
		req.setAttribute("bean", bean);
		if(b)
		{
		
			RequestDispatcher rd=req.getRequestDispatcher("jsp/success.jsp");
			rd.forward(req,  resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("buy.jsp");
			rd.forward(req, resp);
		}
//		
		
		
		
	}

	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
}
