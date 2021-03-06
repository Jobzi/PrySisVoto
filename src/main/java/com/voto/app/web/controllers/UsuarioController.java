package com.voto.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.voto.app.web.models.entities.*;
import com.voto.app.web.models.services.*;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario",usuario);
		return "usuario/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		Usuario usuario = service.findById(id);
		model.addAttribute("usuario",usuario);
		return "usuario/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		Usuario usuario = service.findById(id);
		model.addAttribute("usuario",usuario);
		return "usuario/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id")Integer id, 
			Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex){
			model.addAttribute("error", ex.toString());
		}
		return "redirect:/usuario/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Usuario> usuarios = service.findAll();
		model.addAttribute("usuarios", usuarios);
		return "usuario/list";		
	}
	
	@PostMapping(value="/save")
	public String save(Usuario usuario, Model model) {
		try {
			service.save(usuario);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/usuario/list";
	}
}
