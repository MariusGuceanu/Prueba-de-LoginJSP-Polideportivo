<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EliminarUsuarios" method="POST">
	<label for="id">ID</label>
	<input type="text" name="id">
	<input type="submit" value="enviar">
</form>
 <form action="VerUsuarios">
    	<input type="submit" value="volver">
    </form>
</body>
</html>