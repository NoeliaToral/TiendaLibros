package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.BackOfficeUS;
import modelo.Usuario;


/**
 * Servlet implementation class AltaUsuario
 */
@WebServlet("/AltaUsuario")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    BackOfficeUS backofficeUS=new BackOfficeUS();
  
    public AltaUsuario() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		obtenerdatosUsuario(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		obtenerdatosUsuario(request, response);
	}
	
	public void obtenerdatosUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario=new Usuario();
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("mailUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		backofficeUS.insertarUsuario(usuario);
		
		
		System.out.println(usuario.toString());
	}
	
	private void modificarUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario=new Usuario();
		usuario.setIdUS(Integer.parseInt(request.getParameter("idUS")));
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("direccionUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		
		new BackOfficeUS().modificarUsuario(usuario);
		
		//response.sendRedirect("Listado.jsp");
		
	}
		

	private void eliminarUsuario(HttpServletRequest request, HttpServletResponse response){
		int id;
		
		String dato = request.getParameter("idUS");
		System.out.println("-----------"+dato);
		id = Integer.parseInt(dato);
		System.out.println("el id de usuario es: "+id);
		System.out.println("----------- me voy");
		new BackOfficeUS().eliminarUsuario(id);

	}

}
