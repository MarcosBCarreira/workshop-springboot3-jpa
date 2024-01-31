package com.marcos.cursojava.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
