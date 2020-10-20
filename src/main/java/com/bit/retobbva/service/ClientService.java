package com.bit.retobbva.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.retobbva.persistance.main.Datos;
import com.bit.retobbva.persistance.mock.MockClient;
import com.bit.retobbva.persistance.mock.Perfil;
import com.bit.retobbva.repo.CredencialesRepo;
import com.bit.retobbva.repo.CuentasRepo;
import com.bit.retobbva.repo.DatosRepo;

@Service
public class ClientService {

	private DatosRepo datosRepo;
	
	@Autowired
	public ClientService(DatosRepo datosRepo) {
		this.datosRepo = datosRepo;
	}	
	
	public MockClient getClientByRole(Perfil perfil, String clientId) {	
		
		 Datos client = datosRepo.findById(clientId).orElse(null);
		
		return client.getMock(perfil);
	}

}
