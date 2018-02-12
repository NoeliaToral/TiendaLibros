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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@WebServlet("/AltaLibro")
public class AltaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger logger=LogManager.getLogger("AltaLibro");
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
       logger.info("Ejecutando AltaLibro");
       backOffice = new BackOffice();
       logger.info("Nuevo objeto BackOffice");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String opcion = request.getParameter("opcion");
	RequestDispatcher rd;
		switch(opcion){
		
		case "alta":
			logger.info("Insertando libro");
			backOffice.insertaLibro(obtenerDatosLibro( request,  response));		
			break;
		case "paginaModificar":
			request.setAttribute("libro",backOffice.buscarLibro(Long.parseLong(request.getParameter("isbn"))));
			rd=request.getRequestDispatcher("Modificar.jsp");
			rd.forward(request,response);
			break;
		case "listado":
			logger.info("Listando libros");
			request.setAttribute("listado",backOffice.listarLibros());
			rd=request.getRequestDispatcher("Listado.jsp");
			//System.out.println("------"+backOffice.listarLibros());
			//rd=request.getRequestDispatcher("index2.jsp");
			rd.forward(request,response);
			break;
		case "listadoCliente":
			logger.info("Listando clientes");
			request.setAttribute("listado",backOffice.listarLibros());
			rd=request.getRequestDispatcher("ListadoClientes.jsp");
			rd.forward(request,response);
			break;
		case "modificar":
			logger.info("Modificando libro");
			backOffice.modificarlibro(obtenerDatosLibro(request,response));
			response.sendRedirect("AltaLibro?opcion=listado");
			break;
		case "eliminar":
			logger.info("Eliminando libro");
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
		case "inicio":
			logger.info("Listando libros");
			request.setAttribute("listado",backOffice.listarLibros());
			rd=request.getRequestDispatcher("index2.jsp");
			rd.forward(request,response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
	
	private Libro obtenerDatosLibro(HttpServletRequest request, HttpServletResponse response){
		logger.info("Obteniendo datos de libro");
		Libro libro = new Libro();
		libro.setISBN(Long.parseLong(request.getParameter("isbn")));
		libro.setTitulo(request.getParameter("titulo"));
		libro.setNumPaginas(Integer.parseInt(request.getParameter("numPaginas")));
		libro.setIdioma(request.getParameter("idioma"));
		libro.setPrecio(Double.parseDouble(request.getParameter("precio")));
		libro.setAutor(request.getParameter("autor"));
		libro.setAnio(Integer.parseInt(request.getParameter("fecha")));
		libro.setSinopsis(request.getParameter("sinopsis"));
		logger.info("Datos de libro obtenidos");
		
		return libro;
		
	}

	
}
