package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Autor : Ramiro

@Entity
public class Requisicao  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idRequisicao;
	private Date dataAbertura;
	private String estadoRequisicao;
	
	public Requisicao(Integer idRequisicao, Date dataAbertura, String estadoRequisicao) {
		super();
		this.idRequisicao = idRequisicao;
		this.dataAbertura = dataAbertura;
		this.estadoRequisicao = estadoRequisicao;
	}
	
	public Requisicao () {}

	public Integer getIdRequisicao() {
		return idRequisicao;
	}

	public void setIdRequisicao(Integer idRequisicao) {
		this.idRequisicao = idRequisicao;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getEstadoRequisicao() {
		return estadoRequisicao;
	}

	public void setEstadoRequisicao(String estadoRequisicao) {
		this.estadoRequisicao = estadoRequisicao;
	}
	
	
	
	

}
