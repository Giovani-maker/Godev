package com.proway.rest.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.repository.PessoaRepository;

@Service
public class BuscarPessoasService {

	
	@Autowired
	private PessoaRepository pessoaRepository; 
	
	public List<Pessoa> buscarTodasAsPessoas(){
		
		List<Pessoa> listPessoa = pessoaRepository.findAll();
		
		return listPessoa;
	}
}
