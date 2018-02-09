<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style2.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Lato:100,200,300,400,500,600,700,800,900'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar libro</title>
</head>
	<body>
	<div class="header">
		<div class="header_top">
			<div class="container">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt="" /></a>
				</div>
				<ul class="shopping_grid">
					<a href="#"><li>Join</li></a>
					<a href="login.html"><li>Sign In</li></a>
					<a href="#"><li><span class="m_1">Shopping Bag</span>&nbsp;&nbsp;(0)
							&nbsp;<img src="images/bag.png" alt="" /></li></a>
					<div class="clearfix"></div>
				</ul>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="h_menu4">
			<!-- start h_menu4 -->
			<div class="container">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li><a href="index.html" data-hover="Home">Home</a></li>
					<li><a href="about.html" data-hover="About Us">About Us</a></li>
					<li><a href="careers.html" data-hover="Careers">Careers</a></li>
					<li class="active"><a href="contact.html"
						data-hover="Contact Us">Contact Us</a></li>
					<li><a href="404.html" data-hover="Company Profile">Company
							Profile</a></li>
					<li><a href="register.html" data-hover="Company Registration">Company
							Registration</a></li>
					<li><a href="wishlist.html" data-hover="Wish List">Wish
							List</a></li>
				</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
			<!-- end h_menu4 -->
		</div>
	</div>
	
	<div class="container">
  <h2 class="tituloH2">Modificación de los datos de un libro</h2>
  <form class="form-horizontal" action="AltaLibro" method="POST">
 
    <div class="form-group">
      <label class="control-label col-sm-4" for="ISBN">ISBN:</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" name="codigo" value="${libro.ISBN}" id="email" placeholder="Enter codigo" name="codigo">
        <input type="hidden" name="isbn" value="${libro.ISBN}"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="titulo">Título:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="titulo" value="${libro.titulo}" id="titulo" placeholder="Enter titulo" name="titulo">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="numPaginas">Número de páginas:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="numPaginas" value="${libro.numPaginas}" id="numPaginas" placeholder="Enter numero de paginas" name="numPaginas">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="idioma">Idioma:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="idioma" value="${libro.idioma}" id="idioma" placeholder="Enter idioma" name="idioma">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-4" for="precio">Precio:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="precio" value="${libro.precio}" id="precio" placeholder="Enter precio" name="precio">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="autor">Autor:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="autor" value="${libro.autor}" id="autor" placeholder="Enter autor" name="autor">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-4" for="fecha">Fecha de publicación:</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" name="fecha" value="${libro.anio}" id="fecha" placeholder="Enter fecha" name="fecha">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="sinopsis">Sinopsis:</label>
      <div class="col-sm-4">          
        <textarea class="form-control" name="sinopsis" value="${libro.sinopsis}" id="sinopsis" placeholder="Enter sinopsis" name="sinopsis" cols="10" rows="10"></textarea>
      </div>
    </div>
   
    <div class="form-group">        
      <div class="col-sm-offset-7 col-sm-10">
        <button type="submit" class="btn btn-default">Enviar</button>
        <input type="hidden" name="opcion" value="Modificar datos" />
      </div>
    </div>
  </form>
</div>
		
	<div class="footer_bg"></div>
	<div class="footer">
		<div class="container">
			<div class="col-md-3 f_grid1">
				<h3>About</h3>
				<a href="#"><img src="images/logo.png" alt="" /></a>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s,</p>
			</div>
			<div class="col-md-3 f_grid1 f_grid2">
				<h3>Follow Us</h3>
				<ul class="social">
					<li><a href=""> <i class="fb"> </i>
						<p class="m_3">Facebook</p>
							<div class="clearfix"></div></a></li>
					<li><a href=""><i class="tw"> </i>
						<p class="m_3">Twittter</p>
							<div class="clearfix"></div></a></li>
					<li><a href=""><i class="google"> </i>
						<p class="m_3">Google</p>
							<div class="clearfix"></div></a></li>
					<li><a href=""><i class="instagram"> </i>
						<p class="m_3">Instagram</p>
							<div class="clearfix"></div></a></li>
				</ul>
			</div>
			<div class="col-md-6 f_grid3">
				<h3>Contact Info</h3>
				<ul class="list">
					<li><p>Phone : 1.800.254.5487</p></li>
					<li><p>Fax : 1.800.254.2548</p></li>
					<li><p>
							Email : <a href="mailto:info(at)fashionpress.com">
								info(at)fashionpress.com</a>
						</p></li>
				</ul>
				<ul class="list1">
					<li><p>Aliquam augue a bibendum ipsum diam, semper
							porttitor libero elit egestas gravida, ut quam, nunc taciti</p></li>
				</ul>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="footer_bottom">
		<div class="container">
			<div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">Privacy Policy</a></li> .
					<li><a href="checkout.html">Terms of Service</a></li> .
					<li><a href="checkout.html">Creative Rights Policy</a></li> .
					<li><a href="login.html">Contact Us</a></li> .
					<li><a href="register.html">Support & FAQ</a></li>
				</ul>
			</div>
			<div class="copy">
				<p>
					&copy; 2015 Template by <a href="http://w3layouts.com"
						target="_blank">w3layouts</a>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	</body>
	
</html>