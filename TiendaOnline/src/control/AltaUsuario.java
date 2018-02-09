package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	
	private BackOfficeUS backOfficeUS;

    
  
    public AltaUsuario() {
        backOfficeUS= new BackOfficeUS();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcionUS = request.getParameter("opcion");
		RequestDispatcher rd;
			switch(opcionUS){
			
			case "altaUS":
				backOfficeUS.insertarUsuario(obtenerdatosUsuario( request,  response));		
				break;
				
			case "eliminarUS":
				backOfficeUS.eliminarUsuario(Integer.parseInt(request.getParameter("id")));
				response.sendRedirect("AltaUsuario?opcion=listadoUsuario");
				break;
			case "paginaModificarUS":
				request.setAttribute("usuario",backOfficeUS.buscarUsuario(Integer.parseInt(request.getParameter("id"))));
				rd=request.getRequestDispatcher("ModificarUS.jsp");
				rd.forward(request,response);
				break;
			case "listadoUsuario":
				request.setAttribute("listadoUS",backOfficeUS.listarUsuario());
				rd=request.getRequestDispatcher("ListadoUS.jsp");
				rd.forward(request,response);
				break;
			case "modificarUS":
				backOfficeUS.modificarUsuario(obtenerdatosUsuario(request,response));
				response.sendRedirect("AltaUsuario?opcion=listadoUsuario");
				break;
			}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private Usuario obtenerdatosUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario=new Usuario();
		usuario.setIdUS(Integer.parseInt(request.getParameter("id")));
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("mailUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		return usuario;
	}
	
	

}
