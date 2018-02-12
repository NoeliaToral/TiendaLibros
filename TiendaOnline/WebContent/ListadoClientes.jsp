<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Tienda online de libros</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style2.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Lato:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script src="js/responsiveslides.min.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>
<script type="text/javascript" src="js/hover_pack.js"></script>
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
					<li class="active"><a href="AltaLibro?opcion=inicio" data-hover="Home">Inicio</a></li>
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

<h3>Listado de libros.</h3>
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
						<td><a href="http://localhost:3306/TiendaOnline/ListadoClientes.jsp">Comprar libro</a></td>
						</tr>
				</c:forEach>
			</table>
		</form>
<div class="footer_bg"></div>
<div class="footer">
	<div class="container">
		<div class="col-md-3 f_grid1">
			<a href="#">Librería Acerandría</a>
			<p>En esta librería puedes encontrar casi cualquier libro.</p>
		</div>
		<div class="col-md-3 f_grid1 f_grid2">
			<h3>Siguenoss</h3>
			<ul class="social">
				<li><a href=""> <i class="fb"> </i><p class="m_3">Facebook</p><div class="clearfix"> </div></a></li>
			    <li><a href=""><i class="tw"> </i><p class="m_3">Twittter</p><div class="clearfix"> </div></a></li>
				<li><a href=""><i class="google"> </i><p class="m_3">Google</p><div class="clearfix"> </div></a></li>
				<li><a href=""><i class="instagram"> </i><p class="m_3">Instagram</p><div class="clearfix"> </div></a></li>
			</ul>
		</div>
		<div class="col-md-6 f_grid3">
			<h3>Contáctanos</h3>
				<ul class="list">
					<li><p>Noelia Toral Jiménez</p></li>
					<li><p>Raul Soriano</p></li>	
					<li><p>Javier Romero </p></li>	
				</ul>
			<ul class="list1">
				<li><p>Nos puedes encontrar en:</p></li>
				<li><p>Calle Anabel de Segura nº11</p></li>
			</ul>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
<div class="footer_bottom">
       	<div class="container">
       		<div class="cssmenu">
				<ul>
					<li class="#"><a href="login.html">Política de privacidad</a></li> .
					<li><a href="#">Términos del serivcio</a></li> .
					<li><a href="#">Política de cookies</a></li> .
					<li><a href="#l">Preguntas frecuentes</a></li> .
				</ul>
			</div>
			<div class="copy">
			    <p>&copy;  2018 Template by <a href="inicio.jsp" target="_blank">Acercandría</a></p>
		    </div>
		    <div class="clearfix"> </div>
       	</div>
</div>
</body>
</html>	