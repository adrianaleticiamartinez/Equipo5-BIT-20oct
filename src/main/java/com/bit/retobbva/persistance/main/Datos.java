package com.bit.retobbva.persistance.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class Datos {

	@Id
	@Column(name="idCliente", unique=true, nullable=false)
	public String idCliente;
	
}
