-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.application.*" %>
    <%@page import="com.application.bean.*" %>
        <%@page import="com.application.ProductServlet2" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body {
	font-family: Arial;
	font-size: 17px;
	padding: 8px;
}
*{box-sizing: border-box;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

.btn:hover {
  background-color: #45a049;
}


.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
} 

</style>
</head>
<body>
<div class="row">
  <div class="col-75">
    <div class="container">
      <form action="sb" method="get">
      <div class="col-50">
      <h3>Product Details are </h3>
       <%
       ProductBean p=(ProductBean)request.getAttribute("b");
       out.print(" Detais of the product is "+p.getName());
      
      
         int amount=(int)request.getAttribute("totalAmount");
     out.print(" Total Amount is "+amount);
    
     
    
     
     	 %>
     
     	
     
     	  <input type="hidden" value="<%=p.getId() %>" name="id">
   	
   	<input type="hidden" value="<%= p.getName() %>" name="pname">
   	<input type="hidden" value="<%= p.getPrice() %>" name="price"> 
     	 
      </div>
     
      	
       <div class="row">
          <div class="col-50">
            <h3>Billing Address</h3>
            <label for="fname"><i class="fa fa-user"></i> Full Name</label>
            <input type="text" id="fname" name="firstname" placeholder="Enter name here" required>
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" placeholder="name@example.com" required>
            <label for="city"><i class="fa fa-number"></i> Phone Number</label>
            <input type="text" id="number" name="number" placeholder="1234567890" required>
            
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="Area Name" required>
            <label for="city"><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="Bangalore" required>

            <div class="row">
              <div class="col-50">
                <label for="state">State</label>
                <input type="text" id="state" name="state" placeholder="Karnataka" required>
              </div>
              <!-- <div class="col-50">
                <label for="zip">Zip</label>
                <input type="text" id="zip" name="zip" placeholder="10001">
              </div> -->
            </div>
          </div>

			


<!--           <div class="col-50">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">Name on Card</label>
            <input type="text" id="cname" name="cardname" placeholder="Enter Card Holder Name">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">
            <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">
              </div>
            </div>
          </div> 
 -->          
        </div>
        <label>
          <input type="checkbox" checked="checked" name="sameadr"> Shipping address same as billing
        </label>
        <input type="submit" value="Continue to checkout" class="btn">
         <button ></button>
      </form>
    </div>
  </div>
  </div>
  
</body>
</html>