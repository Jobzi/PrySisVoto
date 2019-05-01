package com.voto.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voto.app.web.models.dao.IUsuarioDAO;
import com.voto.app.web.models.entities.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioDAO dao;
	
	@Override
	public void save(Usuario usuario) {
		dao.save(usuario);	
		
	}

	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) dao.findAll();
	}

}
