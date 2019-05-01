package com.voto.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voto.app.web.models.dao.IPartidoPoliticoDAO;
import com.voto.app.web.models.entities.PartidoPolitico;

@Service
public class PartidoService implements IPartidoPoliticoService {

	@Autowired
	private IPartidoPoliticoDAO dao;
	
	@Override
	public void save(PartidoPolitico partido_politico) {
		dao.save(partido_politico);
		
	}

	@Override
	public PartidoPolitico findById(Integer id) {
		return dao.findById(id).get();
	
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override	
	public List<PartidoPolitico> findAll() {
		return (List<PartidoPolitico>) dao.findAll();
	}

}
