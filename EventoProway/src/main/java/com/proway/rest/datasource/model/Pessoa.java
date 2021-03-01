package com.proway.rest.datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	private String nome;
	
	private String sobrenome;
	
	@Column(name ="id_espaco_cafe1")
	private String idEspacoCafe1;
	@Column(name = "id_espaco_cafe2")
	private String idEspacoCafe2;
	@Column(name = "id_salaevento1")
	private String idSala_Evento1;
	@Column(name = "id_salaevento2")
	private String idSala_Evento2;
	
	
	
	public Pessoa() {
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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


	public String getIdSala_Evento1() {
		return idSala_Evento1;
	}


	public void setIdSala_Evento1(String idSala_Evento1) {
		this.idSala_Evento1 = idSala_Evento1;
	}


	public String getIdSala_Evento2() {
		return idSala_Evento2;
	}


	public void setIdSala_Evento2(String idSala_Evento2) {
		this.idSala_Evento2 = idSala_Evento2;
	}


	
	

}
