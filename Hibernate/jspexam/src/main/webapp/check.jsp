<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
try
{
	Class.forName("");
	Connection c=DriverManager.getConnection("","","");
}
catch(Exception e)
{
	
}
emailid = request.getParameter("email");
password = request.getParameter("password");
if(emailid.equalsIgnoreCase("raj@gmail.com") && password.equals("1234S"))
{
	out.println("success");
	request.setAttribute("ob",emailid);
	%>
	<jsp:forward page="home.jsp"></jsp:forward>
	<% 
}
else
	out.println("Fail");
%>
<jsp:include page="login.jsp"></jsp:include>
<% 

%>


</body>
</html>