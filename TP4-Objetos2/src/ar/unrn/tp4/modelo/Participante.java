package ar.unrn.tp4.modelo;

public class Participante {

	private Nombre nombre;
	private Telefono telefono;
	private Region region;

	public Participante(String nombre, String telefono, String region) {

		this.nombre = new Nombre(nombre);
		this.telefono = new Telefono(telefono);
		this.region = new Region(region);
	}

	public String nombre() {
		return nombre.nombre();
	}

	public String telefono() {
		return telefono.telefono();
	}

	public String region() {
		return region.region();
	}

}
