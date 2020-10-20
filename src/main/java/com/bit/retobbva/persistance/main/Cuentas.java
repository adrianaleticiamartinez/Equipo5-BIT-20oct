package com.bit.retobbva.persistance.main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class Cuentas {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	public String idCliente;
	
	@Column(name="segmento")
	public int segmento;

	@Column(name="cuenta")
	public String cuenta;
	
    @OneToOne(mappedBy = "cuentas", cascade = CascadeType.ALL)
    private Datos datos;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getSegmento() {
		return segmento;
	}
	public void setSegmento(int segmento) {
		this.segmento = segmento;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public Datos getDatos() {
		return datos;
	}
	public void setDatos(Datos datos) {
		this.datos = datos;
	}

}
