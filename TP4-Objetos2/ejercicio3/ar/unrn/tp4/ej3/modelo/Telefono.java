package ar.unrn.tp4.ej3.modelo;

public class Telefono {

	private String telefono;

	public Telefono(String telefono) {

		if (!checkPhone(telefono)) {
			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN\"");

		}
		this.telefono = telefono;
	}

	private boolean checkPhone(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

	@Override
	public String toString() {
		return telefono;
	}

}
