package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBmanager {
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;

	public void conectaBD() {
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://localhost:3306/tiendaonline?verifyServerCertificate=false&useSSL=true";
			String user = "root";
			String password = "1111";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
			System.out.println("Se ha conectado a la base de datos");
		} catch (ClassNotFoundException e) {
			System.out.println("¡No se ha encontrado la clase!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Libro> listarLibros(String query) {
		conectaBD();
		ResultSet rs = null;
		ArrayList<Libro> libros = new ArrayList();
		// Consultas de tipo Select. Devuelve un ResultSet
		try {
			// System.out.println("executeQuery");
			st = con.createStatement();
			rs = st.executeQuery(query);
			// Se procesan los resultados
			while (rs.next()) {
				Libro libro = new Libro(rs.getLong("ISBN"), rs.getString("titulo"), rs.getInt("numPaginas"),
						rs.getString("idioma"), rs.getDouble("precio"), rs.getString("autor"),
						rs.getInt("fechaPublicacion"), rs.getString("sinopsis"), rs.getString("url"));
				libros.add(libro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cierraBD();
		}
		return libros;
	}

	public int modificar(String query) {
		int rows = 0;

		conectaBD();
		// Sentencias Update, Insert, Delete, Create
		try {
			System.out.println("executeUpdate");
			st = con.createStatement();
			rows = st.executeUpdate(query); // Devuelve 0 si es consulta y 1
											// al insertar.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cierraBD();
		}
		return rows;
	}

	public Libro buscarLibro(String query){
		Libro libro = null;
		conectaBD();
		try{
		st=con.createStatement();
		rs=st.executeQuery(query);
		rs.next();
	    libro = new Libro(rs.getLong("ISBN"),rs.getString("titulo"),rs.getInt("numPaginas"),
					rs.getString("idioma"),rs.getDouble("precio"),rs.getString("autor"),rs.getInt("fechaPublicacion"),rs.getString("sinopsis"),rs.getString("url"));
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return libro;
	}

	public void cierraBD() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}