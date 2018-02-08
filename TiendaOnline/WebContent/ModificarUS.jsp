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
			<th>nombre</th>
			<td><input type="text" name="nombre" value="${Usuario.nombreUS}"/></td>
		</tr>
		<tr>
			<th>direccion</th>
			<td><input type="text" name="direccion" value="${Usuario.direccionUS}"/></td>
		</tr>
		<tr>
			<th>correo</th>
			<td><input type="text" name="idioma" value="${Usuario.mailUS}"/></td>
		</tr>
		<tr>
			<th>cont</th>
			<td><input type="text" name="precio" value="${Usuario.passwordUS}"/></td>
		</tr>
		</table>
		<input type="submit" value="Modificar datos usuario" />
		<input type="hidden" name="Modificar" value="Modificar" />
		</form>
</body>
</html>