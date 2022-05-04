package ar.unrn.tp4.ej3.modelo;

public class Dni {

	private String dni;

	public Dni(String dni) {
		if (dni.equals("")) { // las validaciones van en el modelo

			throw new RuntimeException("dni no puede ser vacio");

		}
		this.dni = dni;
	}

	@Override
	public String toString() {
		return dni;
	}

}
