<%@page import="java.io.OutputStream"%>
<%@page import="java.awt.Image"%>
<%@page import="com.application.ProductBean"%>
<%@page import="com.application.DisplayImage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	


	
	<%
	ProductBean bean1=(ProductBean)request.getAttribute("bean");
	out.print(bean1.getName());
	
	//out.println(bean1.getId());
	//out.print(bean1.getPrice());
	
	%>
	<h1> <%= bean1.getName() %></h1>
		<h3><%= bean1.getDetails() %> </h3>
		<br>
		<h2><%= bean1.getPrice() %> Rs</h2>
		
		out.print(bean1.getName());
	<br>
<br><br><br>
<img src="DisplayImage?ID=1" width="50" height="50" />
	<label for="count">No Products</label>
	<form action="bs" method="get">
	<input type="hidden" value="<%= bean1.getId() %>"  name="pro">
	<input type="text" name="count" placeholder="1,2,3..." required> 
	
	
	
	
	
	<input type="submit" value="buynow">
	<input type="submit" value="add to cart" onclick="form.action='cs';">
	
	
	</form>
</body>
</html>



















<!-- <div class="card">
  
  
</div> -->




<!-- 
<img src="C:\Users\YATHISH POOJARY\Desktop\\realme.jpg" alt="Denim Jeans" style="width:50%">
  <h1>Realme 6 Pro Ultra HD</h1>
  <p class="price">15,999</p>
  <p>Some text about the jeans..</p>
  <label></label>
 	<input type="button" value="Buy Now"> -->