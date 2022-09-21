<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>delete Product</h2>
<form action="deleteproduct" method="post">
	<label>PId</label>
	<input type="number" name="pid"><br/>
	<input type="submit" value="delete Product"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>