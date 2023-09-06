package pe.edu.tecsup.colegioapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.colegioapi.entities.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	@Override
	List<Alumno> findAll();
}
