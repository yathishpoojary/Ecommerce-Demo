<%@page import="com.application.bean.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Placed Order</title>

</head>
<body>


<p>Successfully Ordered</p>
<%
AddressBean bean=(AddressBean)request.getAttribute("bean");
%>
<h3><%= "Welcome "+bean.getName() %></h3>
	
	<%
out.println("Your order details are ");


out.println("Delivery Address");

out.println("Name"+bean.getName());
out.println("\nContact Number"+bean.getPhoneNumber());
out.println("\nAddress"+bean.getAddress());
out.println("\ncity: "+bean.getCity()+" State: "+bean.getState());

out.print(bean.getPname());
out.print(bean.getPrice());

%>

 </body>
</html>