<%@page import="java.sql.ResultSet"%>
<%@page import="com.application.WelcomeServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to my site it index.jsp</title>
</head>
<body>
  	<div class="topnav">
		<a class="active" href="#home">Home</a> 
		<a href="#about">About</a>
		<a	href="#contact">Contact</a>
		 <input type="text" placeholder="Search.."> 
		 <%
           String username= (String) session.getAttribute("user");                     
           if (username == null) {
          %>
           <li><a href="jsp/signUp.jsp">Login</a></li>

       <% } else {
 %>
   <li>Hi, <%=username %>  (<a href="/logout.jsp">Logout</a>)</li>
        <% }%>
	</div>

	<form action="ps" method="get">

		<div class="row">
			<div class="column">
				<button type="submit" value="1" name="yat">
					<img alt="" src="image/realme.jpg" class="imgClass" width="50%">
				</button>
				<button type="submit" value="6" name="yat">
					<img alt="" src="image/reame20norzo.jpg" class="imgClass" width="100%">
				</button>
			</div>
			<div class="column">
				<button type="submit" value="2" name="yat">
					<img alt="" src="image/redmi9pro.jpg" class="imgClass" width="100%"><h4>Redmi note 9 pro</h4>
				</button>
				<button type="submit" value="4" name="yat">
					<img alt="" src="image/redminote 8 pro.jpg" class="imgClass" width="100%"><h4>Redmi note 8 pro</h4>
				</button>

			</div>
			<div class="column">
				<button type="submit" value="3" name="yat">
					<img alt="" src="image/samsung.jpg" class="imgClass" width="100%"><h4>Samsung Galaxy 9 Pro</h4>
				</button>
				<button type="submit" value="6" name="yat">
					<img alt="" src="image/samsungIMAGE.jpeg" class="imgClass" width="100%"><h4>Samsung Galaxy F41</h4>
				</button>
			</div>
		</div>




	</form>
  
</body>
</html>