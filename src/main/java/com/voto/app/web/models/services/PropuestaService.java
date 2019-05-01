package com.voto.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voto.app.web.models.dao.IPropuestaDAO;
import com.voto.app.web.models.entities.Propuesta;

@Service
public class PropuestaService implements IPropuestaService{
	@Autowired
	private IPropuestaDAO dao;

	@Override
	public void save(Propuesta propuesta) {
		dao.save(propuesta);	
		
	}

	@Override
	public Propuesta findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Propuesta> findAll() {
		// TODO Auto-generated method stub
		return (List<Propuesta>) dao.findAll();
	}
	
	
}
