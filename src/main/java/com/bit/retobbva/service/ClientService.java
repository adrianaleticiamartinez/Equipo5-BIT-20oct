package com.bit.retobbva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.retobbva.persistance.mock.MockClient;
import com.bit.retobbva.persistance.mock.Perfil;
import com.bit.retobbva.repo.CredencialesRepo;
import com.bit.retobbva.repo.CuentasRepo;
import com.bit.retobbva.repo.DatosRepo;

@Service
public class ClientService {

	private CuentasRepo cuentasRepo;
	private DatosRepo datosRepo;
	private CredencialesRepo credencialesRepo;
	
	@Autowired
	public ClientService(CuentasRepo cuentasRepo, DatosRepo datosRepo, CredencialesRepo credencialesRepo) {
		this.cuentasRepo = cuentasRepo;
		this.datosRepo = datosRepo;
		this.credencialesRepo = credencialesRepo;
	}	
	
	public MockClient getClientByRole(Perfil perfil) {
		// TODO Auto-generated method stub
		return null;
	}

}
