package com.gersongm.springCRUD.DAO;

import org.springframework.data.repository.CrudRepository;

import com.gersongm.springCRUD.model.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
