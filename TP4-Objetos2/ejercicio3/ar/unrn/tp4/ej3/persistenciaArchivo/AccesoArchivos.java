package ar.unrn.tp4.ej3.persistenciaArchivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import ar.unrn.tp4.ej3.modelo.Concursante;
import ar.unrn.tp4.ej3.modelo.PersistenciaConcursantes;
import ar.unrn.tp4.ej3.modelo.PersistenciaConcursos;

public class AccesoArchivos implements PersistenciaConcursos, PersistenciaConcursantes {

	private String pathCasaConcursos = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\concursos.txt";
	private String pathNoteConcursos = "C:\\Users\\Marii\\OneDrive\\Escritorio\\Uni\\concursos.txt";
	private String pathCasaInscripcion = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\inscriptosTp4.txt";
	private String pathNoteInscripcion = "C:\\Users\\Marii\\OneDrive\\Escritorio\\Uni\\inscriptosTp4.txt";

	@Override
	public List<String> leerConcursos() {

		File file = new File(pathCasaConcursos);

		List<String> archivo;
		try {
			archivo = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			throw new RuntimeException("No se pudo leer el archivo");
		}

		return archivo;

	}

	@Override
	public void registrar(Concursante concursante) {
		try {
			Files.write(Paths.get(pathCasaInscripcion), concursante.toString().getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo guardar en disco", e);
		}

	}

}
