package com.marcos.cursojava.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
