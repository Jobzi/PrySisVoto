package com.voto.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.voto.app.web.models.entities.Candidato;
import com.voto.app.web.models.services.ICandidatoService;



@Controller
@RequestMapping(value = "/candidato")
public class CandidatoController {

	  @Autowired
	    private ICandidatoService service;

	    @GetMapping(value="/create" )
	    public String create(Model model){
	        Candidato candidato=new Candidato();
	        model.addAttribute("Candidato",candidato);
	        return "candidato/form";
	    }
	    @PostMapping(value="/save" )
	    public String save(Candidato candidato,Model model){
	        try{
	            service.save(candidato);
	        }catch (Exception ex){
	            model.addAttribute("error: ",ex.toString());
	        }

	        return "redirect:/candidato/list";
	    }
	    @GetMapping(value="/retrieve/{id}" )
	    public String retrieve(@PathVariable(value = "id") Integer id,
	                           Model model){
	        Candidato candidato=service.findById(id);
	        model.addAttribute("Candidato",candidato);
	        return "candidato/card";
	    }
	    @GetMapping(value="/update/{id}" )
	    public String update(@PathVariable(value = "id") Integer id,
	                         Model model){
	        Candidato candidato=service.findById(id);
	        model.addAttribute("Candidato",candidato);
	        return "candidato/form";
	    }
	    @GetMapping(value="/delete" )
	    public String delete(@PathVariable(value = "id") Integer id,
	                         Model model){
	        try{
	            service.delete(id);
	        }catch (Exception ex){
	            model.addAttribute("error: ",ex.toString());
	        }

	        return "redirect:/candidato/List";
	    }

	    @GetMapping(value="/list" )
	    public String list(Model model){
	        List<Candidato> candidatos=service.findAll();
	        model.addAttribute("lista",candidatos);
	        return "candidato/list";
	    }
}
