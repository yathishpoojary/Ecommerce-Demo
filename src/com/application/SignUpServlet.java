package com.application;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.application.Dao.ProfileDao;
import com.application.bean.ProfileBean;
public class SignUpServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String username=req.getParameter("userName");
		String email=req.getParameter("email");
		String password=req.getParameter("psw");
		String phoneNumber=req.getParameter("phoneNumber");
		long number=Long.parseLong(phoneNumber);
		ProfileBean bean=new ProfileBean(phoneNumber, phoneNumber, phoneNumber, phoneNumber, number);
		bean.setName(name);
		bean.setUserName(username);
		bean.setMail(email);
		bean.setPassword(password);
		bean.setPhoneNumber(number);
		 
		ProfileDao add=new ProfileDao();
		add.addDetails(bean);
		
		
		
	}
}
