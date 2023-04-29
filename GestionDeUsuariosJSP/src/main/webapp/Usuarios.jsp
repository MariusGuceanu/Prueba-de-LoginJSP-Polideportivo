<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@   page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.ArrayList"
	import="modelo.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Usuarios</title>
</head>
<link rel="stylesheet" href="style.css">
<body>

	<div class="main">
		<h1>Ver todos los usuarios</h1>

		<table border=2>
			<tr>
				<td>ID</td>
				<td>Nombre</td>
				<td>Contrasena</td>
				<td>Fecha_Nacimiento</td>
				<td>Rol / Tarea</td>
				<td>Acciones</td>
			</tr>


			<c:forEach items="${usuarios}" var="usuario">
				<tr>

					<td>${usuario.id}</td>
					<td>${usuario.nombre}</td>
					<td>***********</td>
					<td>${usuario.fecha_nac}</td>
					<td>${usuario.rol.titulo}</td>
					<td><a href="ModificarUsuario?id=${usuario.id}">Modificar</a></td>
				</tr>

			</c:forEach>

		</table>

		<br> <br> <br> <a class="linkE"
			style="border-style: solid; padding: 1%;" href="EliminarForm.jsp">Eliminar</a>

		<br> <br> <br> <br> <a class="linkI"
			style="border-style: solid; padding: 1%;" href="InsertarUsuario">Insercion</a>
	</div>

</body>
</html>