package com.bit.retobbva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.retobbva.persistance.main.Authentication;
import com.bit.retobbva.repo.AuthRepo;

@Service
public class AuthService {

	private AuthRepo repo;

	@Autowired
	public AuthService(AuthRepo repo) {
		this.repo = repo;
	}

	public boolean isAuth(String id, com.bit.retobbva.persistance.mock.Auth auth) {
		Authentication user = repo.findById(id).orElse(null);
		if(validatePassword(auth.getPassword(), user.)) {
			
		}
	}
}
