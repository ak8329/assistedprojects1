<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>account create Page </h2>
<form action="signup"  method="post">
<label>EmailId</label>
<input type="email" name="email"><br/>
<label>Password</label>
<input type="password" name="password"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
<br/>
<a href="Logindb.jsp">loginpage</a>
</body>
</html>