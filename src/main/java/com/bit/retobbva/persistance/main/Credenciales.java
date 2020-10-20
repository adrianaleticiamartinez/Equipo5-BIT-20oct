package com.bit.retobbva.persistance.main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "credenciales")
public class Credenciales {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	public String idCliente;
	
    @OneToOne(mappedBy = "cuentas", cascade = CascadeType.ALL)
    private Datos datos;

}
