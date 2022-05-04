package ar.unrn.tp4.ej3.modelo;

public class Nombre {

	private String nombre;

	public Nombre(String nombre) {

		if (nombre.equals("")) { // las validaciones van en el modelo

			throw new RuntimeException("Nombre no puede ser vacio");

		}

		this.nombre = nombre;

	}

	@Override
	public String toString() {
		return nombre;
	}

}
