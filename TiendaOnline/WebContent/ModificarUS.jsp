<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Usuario</title>
</head>
<body>
	<h3>Modificacion de los datos de un usuario</h3>
		<form action="AltaUsuario" method="POST">
		<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="" disabled="disabled" value="${usuario.idUS }"/></td>
			<td><input type="hidden" name="id" value="${usuario.idUS }"/></td>
		</tr>
		<tr>
			<td>nombre</td>
			<td><input type="text" name="nombreUS" value="${usuario.nombreUS}"/></td>
		</tr>
		<tr>
			<td>direccion</td>
			<td><input type="text" name="direccionUS" value="${usuario.direccionUS}"/></td>
		</tr>
		<tr>
			<td>correo</td>
			<td><input type="text" name="mailUS" value="${usuario.mailUS}"/></td>
		</tr>
		<tr>
			<td>cont</td>
			<td><input type="text" name="passwordUS" value="${usuario.passwordUS}"/></td>
		</tr>
		</table>
		<input type="submit" value="Modificar datos usuario" />
		<input type="hidden" name="opcion" value="modificarUS"/>
		</form>
</body>
</html>