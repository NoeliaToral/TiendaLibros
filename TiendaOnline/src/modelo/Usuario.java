package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Usuario {
	
	private static final Logger logger=LogManager.getLogger("Usuario");
	
	/**
	 * <p> Clase usuario cons sus correspondientes atributos</p>
	 * <p> Métodos Setters y Getters de los atributos </p>
	 * <p> Método toString</p>
	 * @author Javier Romero
	 */
	
	private String nombreUS;
	private String direccionUS;
	private String mailUS;
	private int idUS;
	private String passwordUS;
	
	
	public Usuario(){
		super();
		logger.info("Ejecutando Usuario");
	}
	
	
	public Usuario(String nombreUS, String direccionUS, String mailUS, int idUS, String passwordUS){
		super();
		logger.info("Ejecutando Usuario");
		this.nombreUS=nombreUS;
		this.direccionUS=direccionUS;
		this.mailUS=mailUS;
		this.idUS=idUS;
		this.passwordUS=passwordUS;
		
	}


	public String getNombreUS() {
		return nombreUS;
	}


	public void setNombreUS(String nombreUS) {
		this.nombreUS = nombreUS;
	}


	public String getDireccionUS() {
		return direccionUS;
	}


	public void setDireccionUS(String direccionUS) {
		this.direccionUS = direccionUS;
	}


	public String getMailUS() {
		return mailUS;
	}


	public void setMailUS(String mailUS) {
		this.mailUS = mailUS;
	}


	public int getIdUS() {
		return idUS;
	}


	public void setIdUS(int idUS) {
		this.idUS = idUS;
	}


	public String getPasswordUS() {
		return passwordUS;
	}


	public void setPasswordUS(String passwordUS) {
		this.passwordUS = passwordUS;
	}


	@Override
	public String toString() {
		return "Usuario [nombreUS=" + nombreUS + ", direccionUS=" + direccionUS + ", mailUS=" + mailUS + ", idUS="
				+ idUS + ", passwordUS=" + passwordUS + "]";
	}
	
	
	
}
