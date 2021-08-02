package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
