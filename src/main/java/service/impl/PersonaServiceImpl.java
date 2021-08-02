package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import commons.GenericServiceImpl;
import dao.PersonaDao;
import model.Persona;
import service.PersonaService;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDao;
	}
}
