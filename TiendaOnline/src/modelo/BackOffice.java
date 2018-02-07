package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BackOffice {
	
	private DBmanager db;
	
	public BackOffice() {
		super();
		db = new DBmanager();
	}
	
	//Métodos
	/**
	 * <p>Inserta el libro que recibe como parámetro en la base de datos.</p>
	 * @author	Felipe Collante.
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
		db.executeUpdate(querydelete);
	}
	
	public Libro buscarLibro(long isbn){
		String query="SELECT * FROM LIBROS WHERE ISBN="+isbn;
		ResultSet rs=db.executeQuery(query);
		Libro libro = null;
		try {
			libro = new Libro(rs.getLong("ISBN"),rs.getString("titulo"),rs.getInt("numPaginas"),
					rs.getString("idioma"),rs.getDouble("precio"),rs.getString("autor"),rs.getInt("fechaPublicacion"),rs.getString("sinopsis"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libro;
		
	}
	
	public void modificarlibro(Libro libro){
		String querymodificar="UPDATE Libros SET Titulo='"+libro.getTitulo()+"' , NumPaginas="+libro.getNumPaginas()+", Idioma='"+libro.getIdioma()+
				"', Precio="+libro.getPrecio()+", Autor='"+libro.getAutor()+"', Anio="+libro.getAnio()+", Sinopsis='"+libro.getSinopsis()+"'WHERE ISBN="+libro.getISBN();
		db.executeUpdate(querymodificar);
		
	}
	public ArrayList<Libro> listarLibros(){
		String query = "SELECT * FROM LIBROS;";
		ArrayList<Libro>libros=new ArrayList();
		ResultSet rs=db.executeQuery(query);
		try {
			while(rs.next()){
				Libro libro = new Libro(rs.getLong("ISBN"),rs.getString("titulo"),rs.getInt("numPaginas"),
						rs.getString("idioma"),rs.getDouble("precio"),rs.getString("autor"),rs.getInt("fechaPublicacion"),rs.getString("sinopsis"));
				libros.add(libro);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return libros;
	}
}
