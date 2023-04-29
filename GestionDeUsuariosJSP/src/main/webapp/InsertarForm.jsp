<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="POST" action="InsertarUsuario">
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre">
        <br> <br>
        <label for="contrasena">Contrasena</label>
        <input type="text" name="contrasena">
        <br> <br>
        <label for="fecha_nac">Fecha_Nac</label>
        <input type="text" name="fecha_nac">
        <br> <br>
        <label for="rol">Rol</label>
        <input type="text" name="rol">
        <br><br>
        <input type="submit" value="Enviar">
    </form>
    <br>
    <form action="VerUsuarios">
    	<input type="submit" value="volver">
    </form>
</body>
</html>