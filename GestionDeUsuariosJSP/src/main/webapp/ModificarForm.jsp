<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList"
	import="modelo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<h1>Modificar Usuario</h1>
	<form action="ModificarUsuario" method="POST">
		<input type="text" value="${usuario.id}" hidden="hidden" name="id">
		
		<label for="nombre">Nombre</label>
        <input type="text" name="nombre" value="${usuario.nombre}">
        
        <label for="contrasena">Contrasena</label>
        <input type="text" name="contrasena" value="${usuario.contrasena}">
        
        <label for="fecha">Fecha</label>
        <input type="date" name="fecha_nac" value="${usuario.fecha_nac}"> 
        
        <label for="rol">Rol</label>
        <input type="text" name="rol" value="${usuario.rol.titulo}"> 
        
        <input type="submit" value="Enviar">
        </form>
        <form action="VerUsuarios">
    	<input type="submit" value="volver">
    </form>
</body>
</html>