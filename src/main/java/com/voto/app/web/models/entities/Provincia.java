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
@Table(name="PROVINCIA")
public class Provincia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="ID_PRO")
	private Integer id_pro;
	
	@Size(max=50)
	@Column(name="NOMBRE_PRO")
	@NotEmpty
	private String nombre_pro;
	
	@OneToMany(mappedBy = "provincia", fetch = FetchType.LAZY)
	private List<Canton> conton;
	
	public Provincia() {
		
	}


	public Provincia(Integer id_pro, String nombre_pro) {
		super();
		this.id_pro = id_pro;
		this.nombre_pro = nombre_pro;
	}
	
	
	public Integer getId_pro() {
		return id_pro;
	}
	public void setId_pro(Integer id_pro) {
		this.id_pro = id_pro;
	}
	public String getNombre_pro() {
		return nombre_pro;
	}
	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}
	

}
