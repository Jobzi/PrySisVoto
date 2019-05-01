package com.voto.app.web.models.services;

import java.util.List;

import com.voto.app.web.models.entities.*;

public interface IPropuestaService {
	public void save(Propuesta propuesta);
	
	public Propuesta findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Propuesta> findAll();	
}
