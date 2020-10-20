package com.bit.retobbva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.retobbva.persistance.main.Usuario;
import com.bit.retobbva.repo.UserRepo;

@Service
public class UserService {

	private UserRepo usuariosRepo;

	@Autowired
	public UserService(UserRepo usuariosRepo) {
		this.usuariosRepo = usuariosRepo;
	}

	public boolean isAuth(com.bit.retobbva.persistance.mock.Auth auth) {
		Usuario user = usuariosRepo.findById(auth.getUser()).orElse(null);
		return validatePassword(auth.getPassword(), user.getPassword());			
	}
	
	//TODO Validate
	private boolean validatePassword(String password, String password2) {
		return password.equals(password2);
	}

	public Usuario findOne(String user) {
		return usuariosRepo.findById(user).orElse(null);
	}
	
}
