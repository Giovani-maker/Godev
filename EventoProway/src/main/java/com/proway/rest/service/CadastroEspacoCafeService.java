package com.proway.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.EspacoCafe;
import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.repository.EspacoCafeRepository;

@Service
public class CadastroEspacoCafeService {

	@Autowired
	private EspacoCafeRepository espacoCafeRs;
	
	public void cadastro(EspacoCafe espaco) {
		
		espacoCafeRs.saveAndFlush(espaco);
	
	
}
}
