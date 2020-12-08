<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import=" com.application.FinalOrderServlet" %>
    <%@ page import=" com.application.FinalOrderServletBean" %>
            <%@ page import=" com.application.AddressBean" %>
            <%@ page import=" com.application.BillingServlet" %>
            <%@ page import=" com.application.ProductBean" %>
            <%@ page import=" com.application.ProductServlet" %>
        
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Order Details</h4>
	
	<%
		/* AddressBean bean=(AddressBean)request.getAttribute("bean");
		out.print("Welcome, "+bean.); */
		FinalOrderServlet bean = (FinalOrderServlet) request.getAttribute("bean");
		out.print(""+bean.);
	%>
</body>
</html>