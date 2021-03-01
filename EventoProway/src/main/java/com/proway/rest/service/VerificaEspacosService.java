package com.proway.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proway.rest.datasource.model.EspacoCafe;
import com.proway.rest.repository.EspacoCafeRepository;

public class VerificaEspacosService {
	
	@Autowired
	private EspacoCafeRepository espacoCafeRepository; 
	
	public List<EspacoCafe> buscarTodosOsEspacos(){
		
		List<EspacoCafe> listEspacos = espacoCafeRepository.findAll();
		
		return listEspacos;
	}
}
