package com.example.client2.repository;

import com.example.client2.entities.Client;
import org.springframework.data. jpa. repository. JpaRepository;
import org.springframework.stereotype. Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { }