package com.voto.app.web.models.services;

import java.util.List;

import com.voto.app.web.models.entities.*;

public interface IUsuarioService {
	public void save(Usuario usuario);
	
	public Usuario findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Usuario> findAll();	
}
