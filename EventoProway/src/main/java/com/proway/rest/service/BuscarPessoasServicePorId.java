package com.proway.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.exception.PessoaNotFoundException;
import com.proway.rest.repository.PessoaRepository;

@Service
public class BuscarPessoasServicePorId{

	@Autowired
	private PessoaRepository pessoaRepository;
	private Optional<Pessoa> optionalPessoa;
	
	public Pessoa buscarPorId(Long id) throws PessoaNotFoundException {
		Optional<Pessoa> optionalPessoa = getOptional(id);
		Pessoa pessoa = null;
		if(!optionalPessoa.isPresent()) {
			throw new PessoaNotFoundException("Pessoa nao encontrada pelo id: "+id);
		}else {
			pessoa = optionalPessoa.get();
		}
		return pessoa;
	}

	private Optional<Pessoa> getOptional(Long id) {
		Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);
		return optionalPessoa;
	}
	
	public void deletarPorId(Long id) throws PessoaNotFoundException {
		Optional<Pessoa> optionalPessoa = getOptional(id);
		
		if(!optionalPessoa.isPresent()) {
			throw new PessoaNotFoundException("Pessoa nao encontrada pelo id: "+id);
		}else {
			pessoaRepository.delete(optionalPessoa.get());
		}	
	}
}
