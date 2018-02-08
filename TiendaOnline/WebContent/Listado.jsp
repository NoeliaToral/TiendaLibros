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
		<h1>Listado de libros.</h1>
		<form action="AltaLibro" method="post">
			<table>
			<tr>
				<th><label for="ISBN">ISBN:</label></th>
				<th><label for="titulo">Título:</label></th>
				<th><label for="numPaginas">Nº páginas:</label></th>
				<th><label for="idioma">Idioma:</label></th>
				<th><label for="precio">Precio:</label></th>
				<th><label for="autor">Autor:</label></th>
				<th><label for="fecha">Año:</label></th>
				<th><label for="opciones">Opciones:</label></th>
				
			</tr>
				<c:forEach var="libro" items="${listado}">
					<tr>
					
						<td><c:out value="${libro.ISBN}"></c:out></td>
						<td><c:out value="${libro.titulo}"></c:out></td>
						<td><c:out value="${libro.numPaginas}"></c:out></td>
						<td><c:out value="${libro.idioma}"></c:out></td>
						<td><c:out value="${libro.precio}"></c:out></td>
						<td><c:out value="${libro.autor}"></c:out></td>
						<td><c:out value="${libro.anio}"></c:out></td>
						<td><a href="AltaLibro?opcion=paginaModificar&isbn=${libro.ISBN}">Modificar</a></td>
						<td><a href="AltaLibro?opcion=eliminar">Eliminar</a></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</center>
</body>
</html>