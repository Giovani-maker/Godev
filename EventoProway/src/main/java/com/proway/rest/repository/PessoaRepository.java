package com.proway.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proway.rest.datasource.model.Pessoa;



public interface PessoaRepository 
extends JpaRepository<Pessoa, Long>{

}
