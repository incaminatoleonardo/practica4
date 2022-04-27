package ar.unrn.tp4.modelo;

public class Participante {

	private String nombre;
	private String telefono;
	private String region;

	public Participante(String nombre, String telefono, String region) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
	}

	public String nombre() {
		return this.nombre;
	}

	public String telefono() {
		return this.telefono;
	}

	public String region() {
		return this.region;
	}

}
