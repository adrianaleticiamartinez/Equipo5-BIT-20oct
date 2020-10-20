package com.bit.retobbva.persistance.main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bit.retobbva.persistance.mock.MockClient;
import com.bit.retobbva.persistance.mock.Perfil;

@Entity
@Table(name = "datos")
public class Datos {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	public String idCliente;

	@OneToOne(mappedBy = "idCliente", cascade = CascadeType.ALL)
	private Cuentas cuentas;

	@OneToOne(mappedBy = "idCliente", cascade = CascadeType.ALL)
	private Credenciales credenciales;

	public MockClient getMock(Perfil perfil) {
		
		return null;
	}
}
