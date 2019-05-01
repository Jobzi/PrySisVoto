package com.voto.app.web.models.services;

import java.util.List;

import com.voto.app.web.models.entities.PartidoPolitico;



public interface IPartidoPoliticoService {
	public void save(PartidoPolitico partido_politico);
	
	public PartidoPolitico findById(Integer id);
	
	public void delete (Integer id);
	
	public List<PartidoPolitico> findAll();
}
