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
	
	private BackOfficeUS backofficeUS;

    
  
    public AltaUsuario() {
        backofficeUS= new BackOfficeUS();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcionUS = request.getParameter("opcion");
		RequestDispatcher rd;
			switch(opcionUS){
			
			case "altaUS":
				backofficeUS.insertarUsuario(obtenerdatosUsuario( request,  response));		
				break;
				
			case "bajaUS":
				eliminarUsuario( request,  response);
				break;
			case "paginaModificarUS":
				String codigo=request.getParameter("id");
				int id=Integer.parseInt(codigo);
				request.setAttribute("libro",backofficeUS.buscarUsuario(id));
				rd=request.getRequestDispatcher("ModificarUS.jsp");
				rd.forward(request,response);
				break;
			case "listadoUsuario":
				request.setAttribute("listado",backofficeUS.listarUsuario());
				rd=request.getRequestDispatcher("Listado.jsp");
				rd.forward(request,response);
				break;
			case "modificarUS":
				backofficeUS.modificarUsuario(obtenerdatosUsuario(request,response));
				rd=request.getRequestDispatcher("Index.html");
				rd.forward(request,response);
				break;
			}
		
		
		obtenerdatosUsuario(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		obtenerdatosUsuario(request, response);
	}
	
	private Usuario obtenerdatosUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario=new Usuario();
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("mailUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		backofficeUS.insertarUsuario(usuario);
		System.out.println(usuario.toString());
		
		return usuario;
	}
	
	private void modificarUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario=new Usuario();
		usuario.setIdUS(Integer.parseInt(request.getParameter("idUS")));
		usuario.setNombreUS(request.getParameter("nombreUS"));
		usuario.setDireccionUS(request.getParameter("direccionUS"));
		usuario.setMailUS(request.getParameter("direccionUS"));
		usuario.setPasswordUS(request.getParameter("passwordUS"));
		backofficeUS.modificarUsuario(usuario);
		
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
