package com.marcos.cursojava.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
