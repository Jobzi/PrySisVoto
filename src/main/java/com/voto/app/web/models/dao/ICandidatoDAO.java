package com.voto.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.voto.app.web.models.entities.Candidato;


public interface ICandidatoDAO extends CrudRepository<Candidato, Integer>{

}
