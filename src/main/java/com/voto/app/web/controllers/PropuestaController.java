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
@RequestMapping(value="/Propuesta")
public class PropuestaController {
	@Autowired
	private IPropuestaService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Propuesta propuesta = new Propuesta();
		model.addAttribute("propuesta",propuesta);
		return "propuesta/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		Propuesta propuesta = service.findById(id);
		model.addAttribute("propuesta",propuesta);
		return "propuesta/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		Propuesta propuesta = service.findById(id);
		model.addAttribute("propuesta",propuesta);
		return "propuesta/form";
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
		return "redirect:/propuesta/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Propuesta> propuestas = service.findAll();
		model.addAttribute("propuestas", propuestas);
		return "propuesta/list";		
	}
	
	@PostMapping(value="/save")
	public String save(Propuesta propuesta, Model model) {
		try {
			service.save(propuesta);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/propuesta/list";
	}
}
