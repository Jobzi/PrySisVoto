package com.voto.app.web.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="ADMINISTRADOR")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="ID_ADM")
	private Integer id_adm;
	
	@Size(max=50)
	@Column(name="NOMBRE_USUARIO_ADM")
	@NotEmpty
	private String nombre_usuario_adm;
	
	@Size(max=500)
	@Column(name="CLAVE_ADM")
	@NotEmpty
	private String clave_adm;
	
	
	public Administrador() {
		
	}
	public Administrador(Integer id_adm, String nombre_usuario_adm, String clave_adm) {
		super();
		this.id_adm = id_adm;
		this.nombre_usuario_adm = nombre_usuario_adm;
		this.clave_adm = clave_adm;
	}
	public Integer getId_adm() {
		return id_adm;
	}
	public void setId_adm(Integer id_adm) {
		this.id_adm = id_adm;
	}
	public String getNombre_usuario_adm() {
		return nombre_usuario_adm;
	}
	public void setNombre_usuario_adm(String nombre_usuario_adm) {
		this.nombre_usuario_adm = nombre_usuario_adm;
	}
	public String getClave() {
		return clave_adm;
	}
	public void setClave(String clave_adm) {
		this.clave_adm = clave_adm;
	}
	

}
