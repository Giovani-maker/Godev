package com.proway.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proway.rest.datasource.model.EspacoCafe;
import com.proway.rest.service.CadastroEspacoCafeService;
import com.proway.rest.service.VerificaEspacosService;

@RestController
@RequestMapping(value = "/api")
public class EspacoCafeController {

	@Autowired
	private CadastroEspacoCafeService serviceCadastro;
	
	//@Autowired
	//private VerificaEspacosService serviceBuscaEspaco; 
	
	@PostMapping(path = "/espacocafe/save")
	public void salvarPessoa(@RequestBody EspacoCafe espaco) {
		serviceCadastro.cadastro(espaco);
	}
	
	//@GetMapping(path = "/espacocafe")
	//public List<EspacoCafe> buscarSalaEvento() {		
	//	return serviceBuscaEspaco.buscarTodosOsEspacos();	
	//}
	
	
}
