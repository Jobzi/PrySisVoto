package com.voto.app.web.models.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="PARTIDOPOLITICO")
public class PartidoPolitico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="ID_PAR")
	private Integer id_par;
	
	@Size(max=50)
	@Column(name="NOMBRE_PAR")
	@NotEmpty
	private String nombre_par;
	
	@Size(max=50)
	@Column(name="FOTO_PAR")
	@NotEmpty
	private String foto_par;
	
	@OneToMany(mappedBy="partidopolitico",fetch=FetchType.LAZY)
	private List<Candidato> candidatos;
	
	
	public PartidoPolitico() {
		
	}
	public PartidoPolitico(Integer id_par, String nombre_par, String foto_par) {
		super();
		this.id_par = id_par;
		this.nombre_par = nombre_par;
		this.foto_par = foto_par;
	}
	public Integer getId_par() {
		return id_par;
	}
	public void setId_par(Integer id_par) {
		this.id_par = id_par;
	}
	public String getNombre_par() {
		return nombre_par;
	}
	public void setNombre_par(String nombre_par) {
		this.nombre_par = nombre_par;
	}
	public String getFoto_par() {
		return foto_par;
	}
	public void setFoto_par(String foto_par) {
		this.foto_par = foto_par;
	}
	
	
	

	
	

}

