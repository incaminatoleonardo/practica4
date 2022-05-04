package ar.unrn.tp4.modelo;

public class Telefono {

	private String numero;

	public Telefono(String numero) {

		if (numero.equals("")) {

			throw new RuntimeException("Debe cargar un telefono");

		}
		if (!validarTelefono(numero)) {

			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN\"");

		}

		this.numero = numero;
	}

	public String telefono() {

		return this.numero;
	}

	private boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

}
