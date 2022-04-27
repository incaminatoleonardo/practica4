package ar.unrn.tp4.modelo;

public class Telefono {

	private String numero;

	public Telefono(String numero) {

		if (numero.equals("")) {

			throw new RuntimeException("Debe cargar un telefono");
			// JOptionPane.showMessageDialog(this, "Debe cargar un telefono");
			// return;
		}
		if (!validarTelefono(numero)) {

			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN\"");
			// JOptionPane.showMessageDialog(this, "El teléfono debe ingresarse de la
			// siguiente forma: NNNN-NNNNNN");
			// return;
		}

		this.numero = numero;
	}

	public String telefono() {

		return this.numero;
	}

	private boolean validarTelefono(String telefono) { // esto va en la clase telefono
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

}
