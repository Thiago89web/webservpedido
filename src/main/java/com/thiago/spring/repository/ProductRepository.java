package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
