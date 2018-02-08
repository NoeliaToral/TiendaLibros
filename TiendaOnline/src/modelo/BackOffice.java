package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class BackOffice {
	
	
	//ATRIBUTOS
	DBmanager db = new DBmanager();
	
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
		db.executeUpdate(query);
	}

	public void eliminarlibro(long isbn){
		
		
		String querydelete= "DELETE FROM Libros WHERE ISBN="+ isbn;
		new DBmanager().executeUpdate(querydelete);
	}
	
	public void modificarlibro(Libro libro){
		String querymodificar="UPDATE Libros SET Titulo='"+libro.getTitulo()+"' , NumPaginas="+libro.getNumPaginas()+", Idioma='"+libro.getIdioma()+
				"', Precio="+libro.getPrecio()+", Autor='"+libro.getAutor()+"', Anio="+libro.getAnio()+", Sinopsis='"+libro.getSinopsis()+"'WHERE ISBN="+libro.getISBN();
		new DBmanager().executeUpdate(querymodificar);
		
	}
}
