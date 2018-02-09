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
			
		case "baja":
			eliminarLibro( request,  response);
			break;
		case "paginaModificar":
			String codigo=request.getParameter("isbn");
			long isbn=Long.parseLong(codigo);
			request.setAttribute("libro",backOffice.buscarLibro(isbn));
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
		case "modificar":
			backOffice.modificarlibro(obtenerDatosLibro(request,response));
			rd=request.getRequestDispatcher("Index.html");
			rd.forward(request,response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String alta = "alta";
		String baja = "baja";
		if(alta.equals(request.getParameter("alta"))){
			obtenerDatosLibro( request,  response);
		}
		if(baja.equals(request.getParameter("baja"))){
			System.out.println("eliminar libro");
			eliminarLibro( request,  response);
		}

		doGet(request, response);
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

	
	private void modificarlibro(HttpServletRequest request, HttpServletResponse response){
		Libro libro=new Libro();
		libro.setISBN(Long.parseLong(request.getParameter("isbn")));
		libro.setTitulo(request.getParameter("titulo"));
		libro.setNumPaginas(Integer.parseInt(request.getParameter("numPaginas")));
		libro.setIdioma(request.getParameter("idioma"));
		libro.setPrecio(Double.parseDouble(request.getParameter("precio")));
		libro.setAutor(request.getParameter("autor"));
		libro.setAnio(Integer.parseInt(request.getParameter("fecha")));
		libro.setSinopsis(request.getParameter("sinopsis"));
		backOffice.modificarlibro(libro);
		try {
			response.sendRedirect("Listado.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		

	private void eliminarLibro(HttpServletRequest request, HttpServletResponse response){
		long isbnn;
		
		String dato = request.getParameter("isbnn");
		System.out.println("-----------"+dato);
		isbnn = Long.parseLong(dato);
		System.out.println("el isbnn es: "+isbnn);
		System.out.println("----------- me voy");

		backOffice.eliminarlibro(isbnn);

	}

}
