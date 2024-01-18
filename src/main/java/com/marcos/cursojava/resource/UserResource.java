package com.marcos.cursojava.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.cursojava.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Marcos Carreira", "marcos.carreira@gmail.com", "(99) 9.9977-9999","Abad3@123");
		return ResponseEntity.ok().body(u);
						
	}
}
