package pe.edu.tecsup.colegioapi.services;

import java.util.List;

import pe.edu.tecsup.colegioapi.entities.Alumno;

public interface AlumnoService {
	
	public List<Alumno> getAll();
	
	public Alumno save(Alumno alumno);

	public Alumno findById(Long id);

	public Alumno update(Long id, Alumno alumno);

	public void deleteById(Long id);
	
}
