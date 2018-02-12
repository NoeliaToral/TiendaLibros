<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Modificar usuario</title>
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
					<li class="active"><a href="AltaLibro?opcion=listado" data-hover="Home">Inicio</a></li>
					<li><a href="Administracion.html" data-hover="Administracion">Acceso administración</a></li>
					<li><a href="AltaLibro?opcion=listadoCliente" data-hover="Acceso clientes">Acceso clientes</a></li>
					<li><a href="AltaUsuario.html" data-hover="Registro cliente">Registro cliente</a></li>
					<li><a href="AltaLibro?opcion=ventas" data-hover="Top ventas">Top ventas</a></li>
					<li><a href="AltaLibro?opcion=recomendado" data-hover="Libros recoemndados">Libros recomendados</a></li>
				 </ul>
				 <script type="text/javascript" src="js/nav.js"></script>
	      </div><!-- end h_menu4 -->
     </div>
</div>
<body>
	
		
<div class="container">
  <h2 class="tituloH2">Modificación de los datos de un usuario</h2>
  <form class="form-horizontal" action="AltaUsuario" method="POST">
    <div class="form-group">
      <label class="control-label col-sm-4" for="idUS" >ID:</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" value="${usuario.idUS }" id="nombreUS" name="nombreUS">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="nombreUS">Nombre:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" value="${usuario.nombreUS}" id="nombreUS" name="nombreUS">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4"  for="direccionUS">Dirección:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" value="${usuario.direccionUS}" id="direccionUS" name="direccionUS">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4"  for="mailUS">Correo electrónico:</label>
      <div class="col-sm-4">          
        <input type="email" class="form-control" value="${usuario.mailUS}" id="mailUS" name="mailUS">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4"  for="passwordUS">Contraseña:</label>
      <div class="col-sm-4">          
        <input type="password" class="form-control" value="${usuario.passwordUS}" id="passwordUS" name="passwordUS">
      </div>
    </div>
     <div class="form-group">        
      <div class="col-sm-offset-5 col-sm-10">
        <input type="submit" class="btn btn-default" value="Modificar datos usuario" />
	<input type="hidden" class="btn btn-default" name="opcion" value="modificarUS"/>
      </div>
    </div>
 </form>
</div>
		
		
		
		
<div class="footer">
	<div class="container">
		<div class="col-md-3 f_grid1">
			<a href="#">Librería Acerandría</a>
			<p>En esta librería puedes encontrar casi cualquier libro.</p>
		</div>
		<div class="col-md-3 f_grid1 f_grid2">
			<h3>Siguenos</h3>
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