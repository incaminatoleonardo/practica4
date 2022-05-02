package ar.unrn.tp4.ej3.persistenciaArchivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import ar.unrn.tp4.ej3.modelo.RepositorioConcursos;

public class AccesoArchivos implements RepositorioConcursos {

	private String pathCasa = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\concursos.txt";
	private String pathNote = "C:\\Users\\Marii\\OneDrive\\Escritorio\\Uni\\concursos.txt";

	@Override
	public List<String> leerConcursos() {

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
