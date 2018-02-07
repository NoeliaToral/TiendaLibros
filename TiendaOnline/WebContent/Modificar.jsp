<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar libro</title>
</head>
	<body>
		<h3>Modificacion de los datos de un libro</h3>
		<form action="AltaLibro" method="POST">
		<table>
		<tr>
			<th>ISBN</th>
			<td><input type="text" name="ISBN" value="${Libro.ISBN}"/></td>
		</tr>
		<tr>
			<th>titulo</th>
			<td><input type="text" name="titulo" value="${Libro.titulo}"/></td>
		</tr>
		<tr>
			<th>numPaginas</th>
			<td><input type="text" name="numPaginas" value="${Libro.numPaginas}"/></td>
		</tr>
		<tr>
			<th>idioma</th>
			<td><input type="text" name="idioma" value="${Libro.idioma}"/></td>
		</tr>
		<tr>
			<th>precio</th>
			<td><input type="text" name="precio" value="${Libro.precio}"/></td>
		</tr>
		<tr>
			<th>autor</th>
			<td><input type="text" name="autor" value="${Libro.autor}"/></td>
		</tr>
		<tr>
			<th>anio</th>
			<td><input type="text" name="anio" value="${Libro.anio}"/></td>
		</tr>
		<tr>
			<th>sinopsis</th>
			<td><input type="text" name="sinopsis" value="${Libro.sinopsis}"/></td>
		</tr>
		</table>
		<input type="submit" value="Modificar datos" />
		<input type="hidden" name="Modificar" value="Modificar" />
		</form>
	</body>
</html>