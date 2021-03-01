package com.proway.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.datasource.model.SalaEvento;
import com.proway.rest.exception.PessoaNotFoundException;
import com.proway.rest.repository.PessoaRepository;
import com.proway.rest.resource.model.PessoaResource;
import com.proway.rest.service.BuscarPessoasService;

import com.proway.rest.service.BuscarPessoasServicePorId;
import com.proway.rest.service.CadastroPessoaService;
import com.proway.rest.service.VerificaSalasService;


@RestController
@RequestMapping(value = "/api")
public class PessoaController {


	@Autowired
	private BuscarPessoasService serviceBuscar;
	
	@Autowired
	private CadastroPessoaService serviceCadastro;

	@Autowired
	private BuscarPessoasServicePorId serviceBuscarId;
	

	
	
	@GetMapping(path = "/pessoa")
	public List<Pessoa> buscarPessoa() {		
		return serviceBuscar.buscarTodasAsPessoas();	
	}


	@GetMapping(path = "/pessoa/id/{id}")
	public Pessoa buscarPessoaPorId(
			@PathVariable(name = "id", required = true)Long id) 
			throws PessoaNotFoundException {

		return serviceBuscarId.buscarPorId(id);

	}

	@PostMapping(path = "pessoa/save")
	public void salvarPessoa(@RequestBody Pessoa pessoa) {
		serviceCadastro.cadastro(pessoa);
	}

	@DeleteMapping(path = "nutricionista/delete/{id}")
	public void deletePessoa(@PathVariable(name = "id", required = true)Long id) throws PessoaNotFoundException {
		serviceBuscarId.deletarPorId(id);
	}
	
	

}
