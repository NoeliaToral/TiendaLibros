package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;

@WebServlet("/AltaLibro")
public class AltaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AltaLibro() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		obtenerDatosLibro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void obtenerDatosLibro(HttpServletRequest request, HttpServletResponse response){
		Libro libro = new Libro();
		libro.setISBN(Long.parseLong(request.getParameter("isbn")));
		libro.setTítulo(request.getParameter("titulo"));
		libro.setNumPaginas(Integer.parseInt(request.getParameter("numPaginas")));
		libro.setIdioma(request.getParameter("idioma"));
		libro.setPrecio(Double.parseDouble(request.getParameter("precio")));
		libro.setAutor(request.getParameter("autor"));
		libro.setAño(Integer.parseInt(request.getParameter("fecha")));
		libro.setSinopsis(request.getParameter("sinopsis"));
		
		//new BackOffice.insertarLibro(libro);
		
	}

}
