package modelo;

public class Libro {

	private long ISBN;
	private String t�tulo;
	private int numPaginas;
	private String idioma;
	private double precio;
	private String autor;
	private int a�o;
	private String sinopsis;

	public Libro() {
		super();

	}

	public Libro(long iSBN, String t�tulo, int numPaginas, String idioma, double precio, String autor, int a�o,
			String sinopsis) {
		super();
		this.ISBN = iSBN;
		this.t�tulo = t�tulo;
		this.numPaginas = numPaginas;
		this.idioma = idioma;
		this.precio = precio;
		this.autor = autor;
		this.a�o = a�o;
		this.sinopsis = sinopsis;
	}


	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

}
