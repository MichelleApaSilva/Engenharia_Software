package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//Autor : Maria Eduarda

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idRESERVA")
	private Integer codReserva;
	private Integer cod_Livro;
	private Integer idUsuario;
	private String dataReserva = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
//	private Date dataReserva;
	private String dataExpiracao = LocalDateTime.now().plusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	//private Date dataExpiracao;

	@ManyToOne
	@JoinColumn(name= "idUSUARIO")
	private Usuario usuario;
	
	
	public Reserva(Integer codReserva, Integer cod_Livro,String dataReserva, String dataExpiracao, Integer idUsuario) {
		super();
		this.codReserva = codReserva;
		this.cod_Livro = cod_Livro;
		this.idUsuario = idUsuario;
		this.dataReserva = dataReserva;
		this.dataExpiracao = dataExpiracao;
	}

	public Integer getCod_Livro() {
		return cod_Livro;
	}

	public void setCod_Livro(Integer cod_Livro) {
		this.cod_Livro = cod_Livro;
	}

	public Reserva(){}
	
	public Integer getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(Integer codReserva) {
		this.codReserva = codReserva;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}

	public String getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(String dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	
}
