package com.proway.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.repository.PessoaRepository;


@Service
public class CadastroPessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	
	public void cadastro(Pessoa pessoa) {
		
			pessoaRepository.saveAndFlush(pessoa);
		
		
	}
}
