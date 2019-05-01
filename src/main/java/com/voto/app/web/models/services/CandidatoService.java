package com.voto.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voto.app.web.models.dao.ICandidatoDAO;
import com.voto.app.web.models.entities.Candidato;
@Service
public class CandidatoService implements ICandidatoService{

	@Autowired
	private ICandidatoDAO dao;
	
	@Override
	public void save(Candidato candidato) {
		// TODO Auto-generated method stub
		dao.save(candidato);
	}

	@Override
	public Candidato findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Candidato> findAll() {
		// TODO Auto-generated method stub
		return (List<Candidato>) dao.findAll();
	}

}
