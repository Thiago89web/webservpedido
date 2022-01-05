package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
