package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BackOffice {
	private static final Logger logger=LogManager.getLogger("BackOffice");

	private DBmanager db;
	
	public BackOffice() {
		super();
		logger.info("Ejecutando Backoffice");
		db = new DBmanager();
		logger.info("Nuevo Objeto DBmanager");
	}

	
	
	
	//METODOS
	/**
	 * <p>Inserta el libro que recibe como parámetro en la base de datos.</p>
	 * <p>Elimina el libro que recibe como parámetro en la base de datos.</p>
	 * <p>Modifca el libro que recibe como parámetro en la base de datos.</p>
	 * @author	Felipe Collante.
	 * @author  Javier Romero.
	 * @param	Libro libro.
	 */
	public void insertaLibro(Libro libro){
		logger.info("Ejecutando insertandoLibro (BackOffice)");
		System.out.println(libro.getISBN());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getNumPaginas());		
		System.out.println(libro.getIdioma());
		System.out.println(libro.getPrecio());
		System.out.println(libro.getAutor());
		System.out.println(libro.getAnio());
		System.out.println(libro.getSinopsis());
		String query = "INSERT INTO libros (ISBN, titulo, numPaginas, idioma, precio, autor, fechaPublicacion, sinopsis) VALUES ("+ libro.getISBN() + ", '" + libro.getTitulo() + "'," + libro.getNumPaginas() + ", '" + libro.getIdioma() + "'," 
													+ libro.getPrecio() + ", '" + libro.getAutor() + "', " + libro.getAnio() + ", '" + libro.getSinopsis() + "');";
		db.modificar(query);
	}

	public void eliminarlibro(long isbn){
		logger.info("Ejecutando eliminarlibro (BackOffice)");
		String querydelete= "DELETE FROM Libros WHERE ISBN="+ isbn;
		db.modificar(querydelete);
	}
	
	public Libro buscarLibro(long isbn){
		logger.info("Ejecutando buscarLibro");
		String query="SELECT * FROM LIBROS WHERE ISBN="+isbn;
		return db.buscarLibro(query);
		
		
	}
	
	public void modificarlibro(Libro libro){
		logger.info("Ejecutando modificarlibro (BackOffice)");
		
		String querymodificar="UPDATE Libros SET Titulo='"+libro.getTitulo()+"' , NumPaginas="+libro.getNumPaginas()+", Idioma='"+libro.getIdioma()+
				"', Precio="+libro.getPrecio()+", Autor='"+libro.getAutor()+"', fechaPublicacion="+libro.getAnio()+", Sinopsis='"+libro.getSinopsis()+"'WHERE ISBN="+libro.getISBN();
		db.modificar(querymodificar);
		
	}
	public ArrayList<Libro> listarLibros(){
		logger.info("Ejecutando listarLibros (BackOffice)");
		
		String query = "SELECT * FROM LIBROS;";
		
		return db.listarLibros(query);
	}
	
	public ArrayList<Libro> darNumeroVentas(){
		String query = "select * from libros order by numeroVentas;";
		
		return db.listarLibros(query);
	}
	
	public ArrayList<Libro> darRecomendando(){
		String query = "select * from libros where recomendado='true';";
		
		return db.listarLibros(query);
	}
	
}
