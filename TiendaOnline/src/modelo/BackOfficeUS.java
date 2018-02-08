package modelo;

public class BackOfficeUS {
	
	//Atributos
	DBmanager dbUS= new DBmanager();
	//METODOS
		/**
		 * <p>Inserta el usuario que recibe como parámetro en la base de datos.</p>
		 * <p>Elimina el usuario que recibe como parámetro en la base de datos.</p>
		 * <p>Modifca el usuario que recibe como parámetro en la base de datos.</p>
		 * @author  Javier Romero.
		 * @param	Usuario usuario.
		 */
	
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
		new DBmanager().modificar(querydeleteUS);
	}
	
	public void modificarUsuario(Usuario usuario){
		String querymodificarUS="UPDATE usuario SET nombre='"+usuario.getNombreUS()+"', correo='"+usuario.getMailUS()+
				"', direccion='"+usuario.getDireccionUS()+"', cont='"+usuario.getPasswordUS()+"'WHERE id="+usuario.getIdUS();
		new DBmanager().modificar(querymodificarUS);
		
	}

}
