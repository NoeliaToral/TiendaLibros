<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style2.css" rel='stylesheet' type='text/css' />
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<div class="header_top">
		<div class="container">
			<div class="logo">
				<a href="inicio.jsp"><h1>Libreria Acercandría</h1></a>
			</div>
		    <div class="clearfix"> </div>
		</div>
	</div>
	<div class="h_menu4"><!-- start h_menu4 -->
		<div class="container">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li class="active"><a href="AltaLibro?opcion=listado" data-hover="Home">Inicio</a></li>
					<li><a href="Administracion.html" data-hover="Administracion">Acceso administración</a></li>
					<li><a href="AltaLibro?opcion=listadoCliente" data-hover="Acceso clientes">Acceso clientes</a></li>
					<li><a href="AltaUsuario.html" data-hover="Registro cliente">Registro cliente</a></li>
					<li><a href="AltaLibro?opcion=ventas" data-hover="Top ventas">Top ventas</a></li>
					<li><a href="AltaLibro?opcion=recomendado" data-hover="Libros recomendados">Libros recomendados</a></li>
				 </ul>
				 <script type="text/javascript" src="js/nav.js"></script>
	      </div><!-- end h_menu4 -->
     </div>
</div>
	
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
							<a href="AltaLibro?opcion=paginaModificar&isbn=${libro.ISBN}">Modificar</a>
							<a href="AltaLibro?opcion=eliminar&isbn=${libro.ISBN}">Eliminar</a>
							
						</div>
					</div>
					

				</c:forEach>
				</div>
		</form>
	
</body>
</html>