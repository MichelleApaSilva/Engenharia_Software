package model;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private Integer isbn;
	private Integer codExemplar;
	
	public Livro(String titulo, String autor, String editora, Integer isbn, Integer codExemplar) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.codExemplar = codExemplar;
	}
	
	public Livro() {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public Integer getCodExemplar() {
		return codExemplar;
	}

	public void setCodExemplar(Integer codExemplar) {
		this.codExemplar = codExemplar;
	}
	
}
