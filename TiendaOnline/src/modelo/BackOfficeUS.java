package modelo;

public class BackOfficeUS {
	
	//Atributos
	DBmanager dbUS= new DBmanager();
	
	public void insertarUsuario(Usuario usuario){
		System.out.println(usuario.getNombreUS());
		System.out.println(usuario.getDireccionUS());
		System.out.println(usuario.getMailUS());		
		System.out.println(usuario.getIdUS());
		System.out.println(usuario.getPasswordUS());
		
		String query = "INSERT INTO usuario (id, nombre, direccion, correo, cont) VALUES ("+usuario.getIdUS()+",'"+ usuario.getNombreUS() + "','" + usuario.getDireccionUS() + "','" + usuario.getMailUS()	+  "','" + usuario.getPasswordUS() +"');";
											
		dbUS.executeUpdate(query);
	

	}

}
