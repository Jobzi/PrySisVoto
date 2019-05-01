package com.voto.app.web.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L; //Aplica para serializable NO TIENE GET&SET
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_USU")
	private Integer id_usu;
	
	@Size(max=255)
	@Column(name = "NOMBRE_USU")
	private String nombre_usu;
	
	@Size(max=255)
	@Column(name = "CEDULA_USU")
	private String cedula_usu;


	@Column(name = "ESTADO_USU")
	private String estado_usu;


	public Usuario() {

	}


	public Usuario(Integer id_usu) {

		this.id_usu = id_usu;
	}


	public Integer getId_usu() {
		return id_usu;
	}


	public void setId_usu(Integer id_usu) {
		this.id_usu = id_usu;
	}


	public String getNombre_usu() {
		return nombre_usu;
	}


	public void setNombre_usu(String nombre_usu) {
		this.nombre_usu = nombre_usu;
	}


	public String getCedula_usu() {
		return cedula_usu;
	}


	public void setCedula_usu(String cedula_usu) {
		this.cedula_usu = cedula_usu;
	}


	public String getEstado_usu() {
		return estado_usu;
	}


	public void setEstado_usu(String estado_usu) {
		this.estado_usu = estado_usu;
	}

	
}
