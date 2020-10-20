package com.bit.retobbva.repo;

import org.springframework.data.repository.CrudRepository;

import com.bit.retobbva.persistance.main.Usuario;

public interface UserRepo extends CrudRepository<Usuario, String> {

}
