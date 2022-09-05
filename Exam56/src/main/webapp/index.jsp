<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="product.jsp"> 
<label>Enter id</label>
<Input type="text" name="id" required><br/>
<label>Enter product name</label>
<Input type="text" name="sname" required> <br/>
<label>Enter price</label>
<Input type="text" name="price" required><br/> 
<label>Enter quality</label>
<input type="text" name="detail"><br/> 
<input type="submit" value="submit"> 
 
</form>
<% 
  if (request.getParameter("error") != null)          
	  out.println("<b>Your session has expired or is invalid input.</b><br>");
%>
</body>
</html>