package com.proway.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.SalaEvento;
import com.proway.rest.repository.SalaEventoRepository;
import com.proway.rest.resource.model.SalaEventoResource;

@Service
public class CadastroSalaEventoService {
	
	@Autowired
	private SalaEventoRepository salaEventoRepository;
	
	
	
	public void cadastro(SalaEvento salaEvento) {
			
			salaEventoRepository.saveAndFlush(salaEvento);
		
		
	}
}
