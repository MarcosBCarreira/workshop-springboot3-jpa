package com.marcos.cursojava.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
