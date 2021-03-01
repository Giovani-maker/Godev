package com.proway.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.datasource.model.SalaEvento;
import com.proway.rest.service.CadastroSalaEventoService;
import com.proway.rest.service.VerificaSalasService;

@RestController
@RequestMapping(value = "/api")
public class SalaEventoController {
	@Autowired
	private VerificaSalasService serviceBuscarSala;
	
	@Autowired
	private CadastroSalaEventoService serviceCadastro;
	
	@PostMapping(path = "/salaevento/save")
	public void salvarPessoa(@RequestBody SalaEvento salaEvento) {
		serviceCadastro.cadastro(salaEvento);
	}
	@GetMapping(path = "/salaevento")
	public List<SalaEvento> buscarSalaEvento() {		
		return serviceBuscarSala.buscarTodasAsSalas();	
	}
}
