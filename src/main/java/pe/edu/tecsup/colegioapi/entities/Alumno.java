package pe.edu.tecsup.colegioapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Alumnos")
@Data
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String correoElectronico;
    private String telefono;

}
