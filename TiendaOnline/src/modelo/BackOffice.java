package modelo;
import java.util.ArrayList;

public class BackOffice {
	//Atributos
	DBmanager db = new DBmanager();
	
	//Métodos
	/**
	 * <p>Inserta el libro que recibe como parámetro en la base de datos.</p>
	 * @author	Felipe Collante.
	 * @param	Libro libro.
	 */
	public void insertaLibro(Libro libro){
		//String query = "SELECT * FROM libros;";
		//db.executeQuery(query);
		System.out.println(libro.getISBN());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getNumPaginas());		
		System.out.println(libro.getIdioma());
		System.out.println(libro.getPrecio());
		System.out.println(libro.getAutor());
		System.out.println(libro.getAnio());
		System.out.println(libro.getSinopsis());
		String query = "INSERT INTO libros (ISBN, titulo, numPaginas, idioma, precio, autor, fechaPublicacion, sinopsis) VALUES ("+ libro.getISBN() + ", " + libro.getTitulo() + "," + libro.getNumPaginas() + ", " + libro.getIdioma() + "," 
													+ libro.getPrecio() + ", " + libro.getAutor() + ", " + libro.getAnio() + ", " + libro.getSinopsis() + ");";
		db.executeUpdate(query);
	}
}
