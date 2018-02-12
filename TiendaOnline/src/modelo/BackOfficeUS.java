package modelo;

import java.util.ArrayList;

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
	
	public BackOfficeUS() {
		super();
		dbUS = new DBmanager();
	}
	
	public void insertarUsuario(Usuario usuario){
		System.out.println(usuario.getNombreUS());
		System.out.println(usuario.getDireccionUS());
		System.out.println(usuario.getMailUS());		
		System.out.println(usuario.getPasswordUS());
		
		String queryUS = "INSERT INTO usuario ( nombre, direccion, correo, cont) VALUES ('"+ usuario.getNombreUS() + "','" + usuario.getDireccionUS() + "','" + usuario.getMailUS()	+  "','" + usuario.getPasswordUS() +"');";
											
		dbUS.modificar(queryUS);
	}
	
	public void eliminarUsuario(int idUS){
		
		String querydeleteUS= "DELETE FROM usuario WHERE id="+ idUS;
		dbUS.modificar(querydeleteUS);
	}
	
	public Usuario buscarUsuario(int idUS){
		String query="SELECT * FROM usuario WHERE id="+idUS;
		return dbUS.buscarUsuario(query);
	}
	
	public void modificarUsuario(Usuario usuario){
		String querymodificarUS="UPDATE usuario SET nombre='"+usuario.getNombreUS()+"', direccion='"+usuario.getDireccionUS()+
				"', correo='"+usuario.getMailUS()+"', cont='"+usuario.getPasswordUS()+"' WHERE id="+usuario.getIdUS();
		dbUS.modificar(querymodificarUS);
		
	}
	
	public ArrayList<Usuario> listarUsuario(){
		String queryUS = "SELECT * FROM usuario;";
		
		return dbUS.listarUsuario(queryUS);
	}
	
	public boolean existeUsuario(String usuario,String contraseña){
		String query="SELECT * FROM usuario WHERE nombre='"+usuario+"' AND cont='"+contraseña+"'";
		if(dbUS.buscarUsuario(query)!=null){
			return true;
		}
		return false;
	}
	
	public boolean existeAdmin(String usuario,String contraseña){
		String query="SELECT * FROM administradores WHERE nombre='"+usuario+"' AND contraseña='"+contraseña+"'";
		if(dbUS.buscarAdmin(query)!=null){
			return true;
		}
		return false;
	}

}
