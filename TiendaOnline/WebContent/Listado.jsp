<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style2.css" rel='stylesheet' type='text/css' />
<title>Insert title here</title>
</head>
<body>
	
		<h1>Listado de libros.</h1>
		<form action="AltaLibro" method="post">
			
			
			<div class="col-md-9 content_right centrar">
			<c:forEach var="libro" items="${listado}">
					<div class="contenedor">
					<span><img src="${libro.url}"></span>
					
						<div class="columnasLibros">
							ISBN: <c:out value="${libro.ISBN}"></c:out><br>
							Titulo: <c:out value="${libro.titulo}"></c:out><br>
							Número de páginas: <c:out value="${libro.numPaginas}"></c:out><br>
							Idioma: <c:out value="${libro.idioma}"></c:out><br>
							Precio: <c:out value="${libro.precio}"></c:out><br>
							Autor: <c:out value="${libro.autor}"></c:out><br>
							Año: <c:out value="${libro.anio}"></c:out>
						</div>
					</div>
				</c:forEach>
				</div>
		</form>
	
</body>
</html>