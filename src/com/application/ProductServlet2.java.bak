package com.application;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
public class ProductServlet2 extends HttpServlet
{
	int id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("This is a ProductServlet2  class and its a return type of xxxx "+req);
		String qname=req.getParameter("yat");
		System.out.println("This is a ProductServlet2  class and its a return type of getParameter "+qname);
		int id=Integer.parseInt(qname);
		ProductBean bean=new ProductBean();
		System.out.println("ProductBean class created and its address is "+bean);
		
		bean.productDetails(id);
		System.out.println();		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Inside the ProductServlet2 class id is "+bean.getId());
		
		ProductServlet2 p=new ProductServlet2();
		p.id=bean.getId();
		req.setAttribute("p", p);
		req.setAttribute("bean2", bean);
		req.setAttribute("bean", bean);
		System.out.println(bean.getId());
		BillingServlet b=new BillingServlet();
		b.setId(bean.getId());
		RequestDispatcher rd=req.getRequestDispatcher("jsp/product.jsp");
		rd.forward(req, resp);
	}
	public int getID()
	{
		return id;
	}
}
