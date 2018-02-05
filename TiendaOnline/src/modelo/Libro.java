package modelo;

public class Libro {

	private long ISBN;
	private String título;
	private int numPaginas;
	private String idioma;
	private double precio;
	private String autor;
	private int año;
	private String sinopsis;

	public Libro() {
		super();

	}

	public Libro(long iSBN, String título, int numPaginas, String idioma, double precio, String autor, int año,
			String sinopsis) {
		super();
		this.ISBN = iSBN;
		this.título = título;
		this.numPaginas = numPaginas;
		this.idioma = idioma;
		this.precio = precio;
		this.autor = autor;
		this.año = año;
		this.sinopsis = sinopsis;
	}


	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

}
