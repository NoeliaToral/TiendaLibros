<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Listado de Usuarios</h1>
			<form action="AltaUsuario" method="post">
			<table>
			<tr>
				<th><label for="idUS">Id de usuario:</label></th>
				<th><label for="nombreUS">Nombre usuario:</label></th>
				<th><label for="direccionUS">Direccion usuario:</label></th>
				<th><label for="mailUS">Correo:</label></th>
				<th><label for="passwordUS">Password usuario:</label></th>
			</tr>
				<c:forEach var="usuario" items="${listadoUS}">
				<tr>
					<td><c:out value="${usuario.idUS}"></c:out></td>
					<td><c:out value="${usuario.nombreUS}"></c:out></td>
					<td><c:out value="${usuario.direccionUS}"></c:out></td>
					<td><c:out value="${usuario.mailUS}"></c:out></td>
					<td><c:out value="${usuario.passwordUS}"></c:out></td>
					<td><a href="AltaUsuario?opcion=paginaModificarUS&id=${usuario.idUS}">ModificarUS</a></td>
					<td><a href="AltaUsuario?opcioneliminarUS">EliminarUS</a></td>
				</tr>
				</c:forEach>
			</table>
			</form>
	</center>
</body>
</html>