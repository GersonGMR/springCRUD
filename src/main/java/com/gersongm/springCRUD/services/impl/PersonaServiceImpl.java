package com.gersongm.springCRUD.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
 
import com.gersongm.springCRUD.commons.GenericServiceImpl;
import com.gersongm.springCRUD.DAO.PersonaDAO;
import com.gersongm.springCRUD.model.Persona;
import com.gersongm.springCRUD.services.PersonaService;
 
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {
 
 @Autowired
 private PersonaDAO personaDao;
 
 @Override
 public CrudRepository<Persona, Long> getDao() {
  return personaDao;
 }
 
}
