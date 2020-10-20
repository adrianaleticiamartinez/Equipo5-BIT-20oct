package com.bit.retobbva.persistance.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Authentication")
public class Authentication {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	public String idCliente;

	@Column(name="password")
	public String password;

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
	
}
