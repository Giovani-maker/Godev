package com.proway.rest.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaResource {
	
	@JsonProperty("nome_pessoa")
	private String nome;
	@JsonProperty("sobrenome_pessoa")
	private String sobrenome;
	@JsonProperty("id_sala_evento1")
	private String idSalaEvento1;
	@JsonProperty("id_sala_evento2")
	private String idSalaEvento2;
	@JsonProperty("id_espaco_cafe1")
	private String idEspacoCafe1;
	@JsonProperty("id_espaco_cafe2")
	private String idEspacoCafe2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getIdSalaEvento1() {
		return idSalaEvento1;
	}
	public void setIdSalaEvento1(String idSalaEvento1) {
		this.idSalaEvento1 = idSalaEvento1;
	}
	public String getIdSalaEvento2() {
		return idSalaEvento2;
	}
	public void setIdSalaEvento2(String idSalaEvento2) {
		this.idSalaEvento2 = idSalaEvento2;
	}
	public String getIdEspacoCafe1() {
		return idEspacoCafe1;
	}
	public void setIdEspacoCafe1(String idEspacoCafe1) {
		this.idEspacoCafe1 = idEspacoCafe1;
	}
	public String getIdEspacoCafe2() {
		return idEspacoCafe2;
	}
	public void setIdEspacoCafe2(String idEspacoCafe2) {
		this.idEspacoCafe2 = idEspacoCafe2;
	}
	
	@Override
	public String toString() {
		return "PessoaResource [nome=" + nome + ", sobrenome=" + sobrenome + ", idSalaEvento1=" + idSalaEvento1
				+ ", idSalaEvento2=" + idSalaEvento2 + ", idEspacoCafe1=" + idEspacoCafe1 + ", idEspacoCafe2="
				+ idEspacoCafe2 + "]";
	}
	
	
}
