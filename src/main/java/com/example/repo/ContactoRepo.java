package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Contacto;

public interface ContactoRepo extends JpaRepository<Contacto, Integer>{

}
