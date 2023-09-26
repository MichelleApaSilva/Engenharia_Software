package model;

import java.util.Date;

//Autor : Ramiro

public class Requisicao {
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
