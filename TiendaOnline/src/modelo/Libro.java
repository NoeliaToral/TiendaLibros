package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Libro {
	
	private static final Logger logger=LogManager.getLogger("Libro");

	private long ISBN;
	private String titulo;
	private int numPaginas;
	private String idioma;
	private double precio;
	private String autor;
	private int anio;
	private String sinopsis;
	String url;

	public Libro() {
		super();
		logger.info("Ejecutando Libro");

	}

	public Libro(long iSBN, String titulo, int numPaginas, String idioma, double precio, String autor, int anio,
			String sinopsis, String url) {
		super();
		logger.info("Ejecutando Libro");
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.idioma = idioma;
		this.precio = precio;
		this.autor = autor;
		this.anio = anio;
		this.sinopsis = sinopsis;
		this.url = url;
	}


	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", numPaginas=" + numPaginas + ", idioma=" + idioma
				+ ", precio=" + precio + ", autor=" + autor + ", anio=" + anio + ", sinopsis=" + sinopsis + "]";
	}
	
	

}
