package com.trupper.examen.examen.app.dao.model;
/*
 * csuarez@truper.com */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "sucursales")
public class Sucursal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "sucursal_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sucursalId;
	
	@Column(length = 50)
	@NonNull
	private String nombre;

	public Integer getSucursalId() {
		return sucursalId;
	}

	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
