package ar.unrn.tp4.ej2.persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import ar.unrn.tp4.ej2.modelo.PersistenciaEmpleados;

public class AccesoArchivo implements PersistenciaEmpleados {

	private String pathCasa = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\empleados.txt";
	private String pathNote = "C:\\Users\\Marii\\OneDrive\\Escritorio\\Uni\\empleados.txt";

	@Override
	public List<String> leerEmpleados() {

		File file = new File(pathCasa);

		List<String> archivo;
		try {
			archivo = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			throw new RuntimeException("No se pudo leer el archivo");
		}

		return archivo;

	}

}
