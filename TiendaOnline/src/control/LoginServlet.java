package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.BackOfficeUS;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("contraseña");
		BackOfficeUS backOffice = new BackOfficeUS();
		RequestDispatcher rd;
		if(backOffice.existeUsuario(usuario, contraseña)){
			rd=request.getRequestDispatcher("/AltaLibro?opcion=listadoCliente");
			rd.forward(request,response);
		}else if(backOffice.existeAdmin(usuario, contraseña)){
			rd=request.getRequestDispatcher("/Administracion.html");
			rd.forward(request,response);
		}else{
		response.sendRedirect("AltaLibro?opcion=listado");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
