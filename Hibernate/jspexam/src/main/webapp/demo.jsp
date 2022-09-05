<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Html</h2>
<%!int a,b,s; %>
<%
a=10;
b=20;
s=a+b;
out.println("sum<br>"+s);
out.println("<br/> <font color=bule> sum of "+s+"</front>");
%>
<br/>
<p>sum of two numbers is<%=10+20 %></p>
<p>sum of two numbers is<%=s %></p>



</body>
</html>