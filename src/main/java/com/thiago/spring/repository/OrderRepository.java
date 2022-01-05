package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
