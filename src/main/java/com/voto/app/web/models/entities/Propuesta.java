package com.voto.app.web.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="PROPUESTA")
public class Propuesta implements Serializable {
	private static final long serialVersionUID = 1L; //Aplica para serializable NO TIENE GET&SET
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_PROP")
	private Integer id_prop;
	
	@Size(max=255)
	@Column(name = "PROPUESTA_PROP")
	private String propuesta_prop;

	@JoinColumn(name="ID_CAND", referencedColumnName="ID_CAND")
	@ManyToOne
	private Candidato candidato; // ALERTA CAMBIAR POR CANDIDATO AUN NO ESTA //ESTA POR CREAR GETTER AND SETTER
	
	
	public Propuesta() {

	}

	public Propuesta(Integer id_prop) {

		this.id_prop = id_prop;
	}

	public Integer getId_prop() {
		return id_prop;
	}

	public void setId_prop(Integer id_prop) {
		this.id_prop = id_prop;
	}

	public String getPropuesta_prop() {
		return propuesta_prop;
	}

	public void setPropuesta_prop(String propuesta_prop) {
		this.propuesta_prop = propuesta_prop;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	//getter and setter
	
}
