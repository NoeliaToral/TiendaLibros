package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*public void statement(String query) {
		try {
			st = con.createStatement();
			// String query = "SELECT * FROM Empleados;";
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/

	public void executeQuery(String query){
		conectaBD();
		//Consultas de tipo Select. Devuelve un ResultSet
		try {
			System.out.println("executeQuery");
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			//Se procesan los resultados
			while(rs.next()){
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" + rs.getString(7) + "\t" + rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			cierraBD();
		}
	}

	public void executeUpdate(String query) {
		conectaBD();
		// Sentencias Update, Insert, Delete, Create
		try {
			st = con.createStatement();
			int num = st.executeUpdate(query); // Devuelve 0 si es consulta y 1
												// al insertar.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			cierraBD();
		}
	}
	
	public void cierraBD() {
		try {
			if(rs != null){
				rs.close();
			}
			if(st != null){
				st.close();
			}
			if(con != null){
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}