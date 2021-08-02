package dao;

import org.springframework.data.repository.CrudRepository;
import model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
