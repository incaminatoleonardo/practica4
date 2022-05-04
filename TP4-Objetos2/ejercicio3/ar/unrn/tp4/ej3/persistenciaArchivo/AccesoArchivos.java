package ar.unrn.tp4.ej3.persistenciaArchivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp4.ej3.modelo.Concursante;
import ar.unrn.tp4.ej3.modelo.Concurso;
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

		List<Concurso> concursos = new ArrayList<>();
		for (String string : archivo) {
			String[] concursoString = string.split(",");
			String[] anioMesDiaIncio = concursoString[2].split("/");
			String[] anioMesDiaFin = concursoString[3].split("/");
			int anoInicio = Integer.parseInt(anioMesDiaIncio[0].trim());
			int mesInicio = Integer.parseInt(anioMesDiaIncio[1]);
			int diaInicio = Integer.parseInt(anioMesDiaIncio[2]);
			int anoFin = Integer.parseInt(anioMesDiaFin[0].trim());
			int mesFin = Integer.parseInt(anioMesDiaFin[1]);
			int diaFin = Integer.parseInt(anioMesDiaFin[2]);

			LocalDate fechaInicio = LocalDate.of(anoInicio, mesInicio, diaInicio);
			LocalDate fechaFin = LocalDate.of(anoFin, mesFin, diaFin);

			Concurso concurso = new Concurso(Integer.parseInt(concursoString[0]), concursoString[1], fechaInicio,
					fechaFin);

			concursos.add(concurso);

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
