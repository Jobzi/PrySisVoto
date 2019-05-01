package com.voto.app.web.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="CANDIDATO")
public class Candidato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="ID_CAND")
	private Integer id_cand;
	
	@Size(max=50)
	@NotEmpty
	@Column(name="NOMBRE_CAND")
	private String nombre_cand;
	
	@Size(max=50)
	@NotEmpty
	@Column(name="CARGO_CAND")
	private String cargo_cand;
	
	@Size(max=50)
	@NotEmpty
	@Column(name="TITULO_CAND")
	private String titulo_cand;
	
	@Size(max=500)
	@NotEmpty
	@Column(name="FOTO_CAND")
	private String foto_cand;
	
	@Size(max=10)
	@NotEmpty
	@Column(name="CEDULA_CAND")
	private String cedula_cand;
	
	@JoinColumn(name = "ID_CAN", referencedColumnName ="ID_CAN")
	@ManyToOne
	private Canton canton;
	
	@JoinColumn(name = "ID_PAR", referencedColumnName ="ID_PAR")
	@ManyToOne
	private PartidoPolitico partidopolitico;
	
	@OneToMany(mappedBy="candidato",fetch=FetchType.LAZY)
	private List<Propuesta> propuesta;
	
	@OneToMany(mappedBy="candidato",fetch=FetchType.LAZY)
	private List<Voto> voto;
	
	
	
	public Candidato() {
		
	}
	
	public Candidato(Integer id) {
		this.id_cand = id;
	}

	public Integer getId_cand() {
		return id_cand;
	}

	public void setId_cand(Integer id_cand) {
		this.id_cand = id_cand;
	}

	public String getNombre_cand() {
		return nombre_cand;
	}

	public void setNombre_cand(String nombre_cand) {
		this.nombre_cand = nombre_cand;
	}

	public String getCargo_cand() {
		return cargo_cand;
	}

	public void setCargo_cand(String cargo_cand) {
		this.cargo_cand = cargo_cand;
	}

	public String getTitulo_cand() {
		return titulo_cand;
	}

	public void setTitulo_cand(String titulo_cand) {
		this.titulo_cand = titulo_cand;
	}

	public String getFoto_cand() {
		return foto_cand;
	}

	public void setFoto_cand(String foto_cand) {
		this.foto_cand = foto_cand;
	}

	public String getCedula_cand() {
		return cedula_cand;
	}

	public void setCedula_cand(String cedula_cand) {
		this.cedula_cand = cedula_cand;
	}

	public Canton getCanton() {
		return canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}

	public PartidoPolitico getPartido() {
		return partidopolitico;
	}

	public void setPartido(PartidoPolitico partido) {
		this.partidopolitico = partido;
	}

	public List<Voto> getVoto() {
		return voto;
	}

	public void setVoto(List<Voto> voto) {
		this.voto = voto;
	}

	public List<Propuesta> getPropuesta() {
		return propuesta;
	}

	public void setPropuesta(List<Propuesta> propuesta) {
		this.propuesta = propuesta;
	}
	
	
	
}
