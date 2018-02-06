package modelo;
import java.util.ArrayList;

public class BackOffice {
	/**
	 * <p>Inserta el libro que recibe como parámetro en la base de datos.</p>
	 * @author	Felipe Collante.
	 * @param	Libro libro.
	 */

	public void eliminarlibro(Libro libro){
		
		long libroborrado= libro.getISBN();
		String querydelete= "DELETE FROM Libros WHERE ISBN="+ libroborrado;
		new DBmanager().executeUpdate(querydelete);
		
	}

}
