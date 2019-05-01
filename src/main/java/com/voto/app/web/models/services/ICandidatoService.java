package com.voto.app.web.models.services;

import java.util.List;

import com.voto.app.web.models.entities.Candidato;

public interface ICandidatoService {

	public void save(Candidato candidato);
	
	public Candidato findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Candidato> findAll();
}
