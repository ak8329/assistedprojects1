<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 
<table class="table" border=2> 
  <thead> 
    <tr> 
    <th scope="col">Product ID</th> 
      <th scope="col">Product Name</th> 
      <th scope="col">Price</th> 
    
    </tr> 
  </thead> 
  <tbody> 
    <tr> 
       
      <td> <%=session.getAttribute("pid")%></td> 
      <td> <%=session.getAttribute("pname")%></td> 
      <td> <%=session.getAttribute("price")%></td> 
     
       
    </tr> 
  </tbody> 
</table> 

</body>
</html>