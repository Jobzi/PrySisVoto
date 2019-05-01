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

@Entity
@Table(name="VOTO")
public class Voto implements Serializable{
	private static final long serialVersionUID = 1L; //Aplica para serializable NO TIENE GET&SET
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_VOT")
	private Integer id_vot;

	
	@JoinColumn(name="ID_CAND", referencedColumnName="ID_CAND")
	@ManyToOne
	private Candidato candidato; // ALERTA CAMBIAR POR CANDIDATO AUN NO ESTA
	
	
	
	public Voto() {
		
	}

	public Voto(Integer id_vot) {
		
		this.id_vot = id_vot;
	}

	public Integer getId_vot() {
		return id_vot;
	}

	public void setId_vot(Integer id_vot) {
		this.id_vot = id_vot;
	}


	
}
