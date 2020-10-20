package com.bit.retobbva.repo;

import org.springframework.data.repository.CrudRepository;

import com.bit.retobbva.persistance.main.Authentication;

public interface CuentasRepo extends CrudRepository<Authentication, String> {

}
