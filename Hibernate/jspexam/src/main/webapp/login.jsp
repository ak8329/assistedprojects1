<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<from action="check.jsp" method="get">
     <label>emailId</label>
	<input type="emailid" name="email"><br/>
	<label>password</label>
	<input type="password" name="password"><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
      
 </from>
      

</body>
</html>