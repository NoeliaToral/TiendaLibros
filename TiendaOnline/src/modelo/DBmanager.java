package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBmanager {
	
	private static final Logger logger=LogManager.getLogger("DBmanager");
	
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;

	public void conectaBD() {
		logger.info("Ejecutando conectaBD");
		
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
		logger.info("Ejecutando listarlibros (DBmanager)");
		
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
	
	public ArrayList<Usuario> listarUsuario(String query) {
		logger.info("Ejecutando listarUsuario (DBmanager)");
		
		conectaBD();
		ResultSet rs = null;
		ArrayList<Usuario> Usuarios = new ArrayList();
		// Consultas de tipo Select. Devuelve un ResultSet
		try {
			// System.out.println("executeQuery");
			st = con.createStatement();
			rs = st.executeQuery(query);
			// Se procesan los resultados
			while (rs.next()) {
				Usuario usuario = new Usuario( rs.getString("nombre"),
						rs.getString("direccion"), rs.getString("correo"),rs.getInt("id"),
						 rs.getString("cont"));
				Usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cierraBD();
		}
		return Usuarios;
	}

	public int modificar(String query) {
		logger.info("Ejecutando modificar (DBmanager)");
		
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
		logger.info("Ejecutando buscarlibro (DBmanager)");
		
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
	
	public Usuario buscarUsuario(String query){
		logger.info("Ejecutando buscarUsuario (DBmanager)");
		
		Usuario usuario = null;
		conectaBD();
		try{
		st=con.createStatement();
		rs=st.executeQuery(query);
		rs.next();
	    usuario = new Usuario(rs.getString("nombre"),rs.getString("direccion"),rs.getString("correo"),rs.getInt("id"),rs.getString("cont"));
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	public void cierraBD() {
		logger.info("Ejecutando cierraBD (DBmanager)");
		
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