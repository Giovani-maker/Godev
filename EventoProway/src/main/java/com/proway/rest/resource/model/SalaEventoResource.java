package com.proway.rest.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalaEventoResource {

	@JsonProperty("nome")
	private String nome;
	@JsonProperty("lotacao")
	private String lotacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLotacao() {
		return lotacao;
	}
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	
}
