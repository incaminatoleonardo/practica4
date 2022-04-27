package ar.unrn.tp4.ej2.modelo;

import java.time.LocalDate;

public class Empleado {

	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String email;

	public Empleado(String nombre, String apellido, LocalDate fechaNac, String email) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.email = email;
	}

}
