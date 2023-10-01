package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Autor : Maria Eduarda

@Entity
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	//na minha versão do banco de dados não estava autoincremental
	//assim gerou erro.
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_livro")
	private Integer codExemplar;
	
	private String titulo;
	private String autor;
	private String editora;
	private Long isbn;
	
	
	public Livro(Integer codExemplar, String titulo, String autor, String editora, Long isbn) {
		super();
		this.codExemplar = codExemplar;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
	}
	
	public Livro() {}

	public Integer getCodExemplar() {
		return codExemplar;
	}

	public void setCodExemplar(Integer codExemplar) {
		this.codExemplar = codExemplar;
	}
		
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

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}


	
	
}
