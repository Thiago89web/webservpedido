package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
