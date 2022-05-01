package ar.unrn.tp4.ej2.modelo;

import java.util.ArrayList;
import java.util.List;

public class StubAccesoArchivo implements PersistenciaEmpleados {

	private List<String> archivo = new ArrayList<>();

	public StubAccesoArchivo() {

	}

	@Override
	public List<String> leerEmpleados() {
		this.archivo.add("Young, Angus, 1982-10-08, angus@acdc.com");
		this.archivo.add("Johnson, Brian, 1975-09-11, brian@acdc.com");
		this.archivo.add("Perez, Juan, 1985-09-11, juan@acdc.com");
		this.archivo.add("Gomez, Martin, 1986-02-25, martin@acdc.com");
		return this.archivo;
	}

}
