<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<from action="productcontroller" method="get">
<label>product no</label>
<input type="pno" name="pno"><br/>
<label>Pname</label>
<input type="pname" name="pname"><br/>
<label>Price</label>
<input type="price" name="price"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
</body>
</html>