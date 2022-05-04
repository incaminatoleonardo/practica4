package ar.unrn.tp4.ej3.modelo;

public class Apellido {

	private String apellido;

	public Apellido(String apellido) {
		if (apellido.equals("")) { // las validaciones van en el modelo

			throw new RuntimeException("apellido no puede ser vacio");

		}
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return apellido;
	}

}
