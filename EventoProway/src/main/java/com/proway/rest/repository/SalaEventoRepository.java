package com.proway.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.proway.rest.datasource.model.SalaEvento;

public interface SalaEventoRepository 
	extends JpaRepository<SalaEvento, Long>{

}
