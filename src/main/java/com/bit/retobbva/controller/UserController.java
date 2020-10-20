package com.bit.retobbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.retobbva.persistance.mock.Auth;
import com.bit.retobbva.service.AuthService;

@RestController
public class UserController {

	@Autowired AuthService authService;

	@RequestMapping(value={"/client/{id}"})
	@GetMapping
	public ResponseEntity<?> getClient(@PathVariable("id") String id, @RequestBody Auth auth) {
		
		
		return ResponseEntity.ok(list);
		
	}

}
