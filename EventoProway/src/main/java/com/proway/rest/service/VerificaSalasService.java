package com.proway.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proway.rest.datasource.model.SalaEvento;
import com.proway.rest.repository.SalaEventoRepository;

@Service
public class VerificaSalasService {

	@Autowired
	private SalaEventoRepository salaEventoRepository; 
	
	public List<SalaEvento> buscarTodasAsSalas(){
		
		List<SalaEvento> listSalas = salaEventoRepository.findAll();
		
		return listSalas;
	}
}
