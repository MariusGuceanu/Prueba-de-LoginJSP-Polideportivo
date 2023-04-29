<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Log in</h1>

	<form action="/login" method="POST">
		
		<label for="nombre">Nombre</label>
		<input type="text" name="nombre" value="" placeholder="Escribe tu nombre de usuario">
        
        <label for="contrasena">Contrasena</label>
        <input type="text" name="contrasena" value="" placeholder="Escribe tu contrasena">
        
        <input type="submit" value="Loggear">
        </form>
        
    	
</body>
</html>