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
@Table(name="CANTON")
public class Canton implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="ID_CAN")
	private Integer id_can;
	
	@Size(max=50)
	@NotEmpty
	@Column(name="NOMBRE_CAN")
	private String nombre_can;
	
	@JoinColumn(name = "ID_PRO", referencedColumnName ="ID_PRO")
	@ManyToOne
	private Provincia provincia;
	
	@OneToMany(mappedBy="partidopolitico",fetch=FetchType.LAZY)
	private List<Candidato> candidatos;
	public Canton() {
		
	}
	
	public Canton(Integer id) {
		this.id_can = id;
	}

	public Integer getId_can() {
		return id_can;
	}

	public void setId_can(Integer id_can) {
		this.id_can = id_can;
	}

	public String getNombre_can() {
		return nombre_can;
	}

	public void setNombre_can(String nombre_can) {
		this.nombre_can = nombre_can;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
