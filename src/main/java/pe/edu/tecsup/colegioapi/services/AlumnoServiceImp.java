package pe.edu.tecsup.colegioapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.colegioapi.entities.Alumno;
import pe.edu.tecsup.colegioapi.repositories.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> getAll() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(alumno);
	}

	@Override
	public Alumno findById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).orElseThrow();
	}

	@Override
	public Alumno update(Long id, Alumno alumno) {
		return alumnoRepository.save(alumno);
    }

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

}
