package com.marcos.cursojava.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
