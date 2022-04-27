package ar.unrn.tp4.modelo;

public class Nombre {

	private String nombre;

	public Nombre(String nombre) {

		if (nombre.equals("")) { // las validaciones van en el modelo

			throw new RuntimeException("Debe cargar un nombre");
			// JOptionPane.showMessageDialog(this, "Debe cargar un nombre");
			// return;
		}

		this.nombre = nombre;
	}

	public String nombre() {

		return this.nombre;
	}

}
