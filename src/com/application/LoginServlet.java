package com.application;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.application.Dao.ProfileDao;
import com.application.bean.ProfileBean;
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
			String password=req.getParameter("password");
			String number=req.getParameter("phoneNumber");
			long phoneNumber=Long.parseLong("");
			
			ProfileBean bean=new ProfileBean(password, phoneNumber);
			bean.setPassword(password);
			bean.setPhoneNumber(phoneNumber);
			
			ProfileDao add=new ProfileDao();
			Boolean b=add.isLogIn(bean);
			if(b)
			{
				HttpSession session = req.getSession(true);
				  String user = req.getParameter("username");
				  session.setAttribute("user", bean.getName());
			}
			else
			{
				
			}
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
	}
}
