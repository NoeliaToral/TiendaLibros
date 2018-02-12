package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import modelo.BackOfficeUS;
import modelo.Usuario;


/**
 * Servlet implementation class AltaUsuario
 */
@WebServlet("/AltaUsuario")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger=LogManager.getLogger("AltaUsuario");
	
	private BackOfficeUS backOfficeUS;

    
  
    public AltaUsuario() {
    	logger.info("Ejecutando AltaUsuario");
        backOfficeUS= new BackOfficeUS();
        logger.info("Nuevo objeto backOfficeUS");
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcionUS = request.getParameter("opcion");
		RequestDispatcher rd;
			switch(opcionUS){
			
			case "altaUS":
				logger.info("Registrando usuario");
				backOfficeUS.insertarUsuario(obtenerdatosUsuario( request,  response));		
				break;
				
			case "eliminarUS":
				logger.info("Eliminando usuario");
				backOfficeUS.eliminarUsuario(Integer.parseInt(request.getParameter("id")));
				response.sendRedirect("AltaUsuario?opcion=listadoUsuario");
				break;
			case "paginaModificarUS":
				request.setAttribute("usuario",backOfficeUS.buscarUsuario(Integer.parseInt(request.getParameter("id"))));
				rd=request.getRequestDispatcher("ModificarUS.jsp");
				rd.forward(request,response);
				break;
			case "listadoUsuario":
				 logger.info("Listando usuarios");
				request.setAttribute("listadoUS",backOfficeUS.listarUsuario());
				rd=request.getRequestDispatcher("ListadoUS.jsp");
				rd.forward(request,response);
				break;
			case "modificarUS":
				logger.info("Modificando usuario");
				backOfficeUS.modificarUsuario(obtenerdatosUsuario(request,response));
				response.sendRedirect("AltaUsuario?opcion=listadoUsuario");
				break;
			}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private Usuario obtenerdatosUsuario(HttpServletRequest request, HttpServletResponse response){
		logger.info("Obteniendo datos de usuarios");
		Usuario usuario=new Usuario();
		usuario.setIdUS(Integer.parseInt(request.getParameter("id")));
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("mailUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		logger.info("Datos de usuario obtenidos");
		return usuario;
	}
	
	

}
