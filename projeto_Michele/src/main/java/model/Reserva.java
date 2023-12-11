package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Autor : Maria Eduarda

@Entity
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codReserva;
	private Integer cod_Livro;
	private Integer idUsuario;
	private Date dataReserva;
	private Date dataExpiracao;
	
	public Reserva(Integer codReserva, Date dataReserva, Date dataExpiracao, Integer idUsuario) {
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
	
	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	
}
