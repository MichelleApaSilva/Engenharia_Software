package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codReserva;
	private Date dataReserva;
	private Date dataExpiracao;
	
	public Reserva(Integer codReserva, Date dataReserva, Date dataExpiracao) {
		super();
		this.codReserva = codReserva;
		this.dataReserva = dataReserva;
		this.dataExpiracao = dataExpiracao;
	}

	public Integer getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(Integer codReserva) {
		this.codReserva = codReserva;
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
