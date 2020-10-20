package com.bit.retobbva.persistance.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bit.retobbva.persistance.mock.Perfil;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	private String idCliente;

	@Column(name="auth")
	private String password;

	@Column(name="perfil")
	private Perfil perfil;
	
	@Column(name="segmento")
	private String segmento;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="area")
	private String area;
	
	@Column(name="nombre")
	private String nombre;
	
	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}