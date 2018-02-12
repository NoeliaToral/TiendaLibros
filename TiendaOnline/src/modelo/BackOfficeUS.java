package modelo;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BackOfficeUS {
	
	//Atributos
	DBmanager dbUS;
	//METODOS
		/**
		 * <p>Inserta el usuario que recibe como parámetro en la base de datos.</p>
		 * <p>Elimina el usuario que recibe como parámetro en la base de datos.</p>
		 * <p>Modifca el usuario que recibe como parámetro en la base de datos.</p>
		 * @author  Javier Romero.
		 * @param	Usuario usuario.
		 */
	
	private static final Logger logger=LogManager.getLogger("BackOfficeUS");
	
	public BackOfficeUS() {
		super();
		logger.info("Ejecutando BackOfficeUS");
		dbUS = new DBmanager();
		logger.info("Nuevo Objeto DBmanager");
	}
	
	public void insertarUsuario(Usuario usuario){
		logger.info("Ejecutando insertar usuario (BackOfficeUS)");
		System.out.println(usuario.getNombreUS());
		System.out.println(usuario.getDireccionUS());
		System.out.println(usuario.getMailUS());		
		System.out.println(usuario.getPasswordUS());
		
		String queryUS = "INSERT INTO usuario ( nombre, direccion, correo, cont) VALUES ('"+ usuario.getNombreUS() + "','" + usuario.getDireccionUS() + "','" + usuario.getMailUS()	+  "','" + usuario.getPasswordUS() +"');";
											
		dbUS.modificar(queryUS);
	}
	
	public void eliminarUsuario(int idUS){
		
		logger.info("Ejecutando eliminar usuario (BackOfficeUS)");
		
		String querydeleteUS= "DELETE FROM usuario WHERE id="+ idUS;
		dbUS.modificar(querydeleteUS);
	}
	
	public Usuario buscarUsuario(int idUS){
		logger.info("Ejecutando eliminar usuario");
		
		String query="SELECT * FROM usuario WHERE id="+idUS;
		return dbUS.buscarUsuario(query);
	}
	
	public void modificarUsuario(Usuario usuario){
		logger.info("Ejecutando modificar usuario (BackOfficeUS)");
		
		String querymodificarUS="UPDATE usuario SET nombre='"+usuario.getNombreUS()+"', direccion='"+usuario.getDireccionUS()+
				"', correo='"+usuario.getMailUS()+"', cont='"+usuario.getPasswordUS()+"' WHERE id="+usuario.getIdUS();
		dbUS.modificar(querymodificarUS);
		
	}
	
	public ArrayList<Usuario> listarUsuario(){
		logger.info("Ejecutando listar usuario (BackOfficeUS)");
		
		String queryUS = "SELECT * FROM usuario;";
		
		return dbUS.listarUsuario(queryUS);
	}

}
