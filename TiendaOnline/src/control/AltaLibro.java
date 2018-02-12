package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.BackOffice;
import modelo.Libro;

@WebServlet("/AltaLibro")
public class AltaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	//Métodos
	/**
	 * <p>Método obtenerDatosLibro nos devuelve los datos del un objeto Libro dada una query</p>
	 * <p>Método modificarLibro nos devuelve los datos del un objeto Libro dada una query</p>
	 * <p>Método eliminarLibro nos devuelve los datos del un objeto Libro dada una query</p>
	 * 
	 * 
	 */
	

	private BackOffice backOffice;


    public AltaLibro() {
       backOffice = new BackOffice();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String opcion = request.getParameter("opcion");
	RequestDispatcher rd;
		switch(opcion){
		
		case "alta":
			backOffice.insertaLibro(obtenerDatosLibro( request,  response));		
			break;
		case "paginaModificar":
			request.setAttribute("libro",backOffice.buscarLibro(Long.parseLong(request.getParameter("isbn"))));
			rd=request.getRequestDispatcher("Modificar.jsp");
			rd.forward(request,response);
			break;
		case "listado":
			request.setAttribute("listado",backOffice.listarLibros());
			//rd=request.getRequestDispatcher("Listado.jsp");
			//System.out.println("------"+backOffice.listarLibros());
			rd=request.getRequestDispatcher("index2.jsp");
			rd.forward(request,response);
			break;
		case "listadoCliente":
			request.setAttribute("listado",backOffice.listarLibros());
			rd=request.getRequestDispatcher("ListadoClientes.jsp");
			rd.forward(request,response);
			break;
		case "modificar":
			backOffice.modificarlibro(obtenerDatosLibro(request,response));
			response.sendRedirect("AltaLibro?opcion=listado");
			break;
		case "eliminar":
			backOffice.eliminarlibro(Long.parseLong(request.getParameter("isbn")));
			response.sendRedirect("AltaLibro?opcion=listado");
			break;
		case "ventas":
			request.setAttribute("listado",backOffice.darNumeroVentas());
			rd=request.getRequestDispatcher("numVentas.jsp");
			rd.forward(request,response);
			break;
		case "recomendado":
			request.setAttribute("listado",backOffice.darRecomendando());
			rd=request.getRequestDispatcher("darRecomendado.jsp");
			rd.forward(request,response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
	
	private Libro obtenerDatosLibro(HttpServletRequest request, HttpServletResponse response){
		Libro libro = new Libro();
		libro.setISBN(Long.parseLong(request.getParameter("isbn")));
		libro.setTitulo(request.getParameter("titulo"));
		libro.setNumPaginas(Integer.parseInt(request.getParameter("numPaginas")));
		libro.setIdioma(request.getParameter("idioma"));
		libro.setPrecio(Double.parseDouble(request.getParameter("precio")));
		libro.setAutor(request.getParameter("autor"));
		libro.setAnio(Integer.parseInt(request.getParameter("fecha")));
		libro.setSinopsis(request.getParameter("sinopsis"));
		
		return libro;
		
	}

	
}
