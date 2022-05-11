package ar.unrn.tp4.ej3.modelo;

import java.time.LocalDate;
import java.util.List;

public class SistemaConcursos {

	private PersistenciaConcursos repo;

	public SistemaConcursos(PersistenciaConcursos repo) {

		this.repo = repo;
	}

	public List<Concurso> leerConcursos() {

		return this.repo.leerConcursos();
	}

	public List<Concurso> concursosActivos() {

		// List<Concurso> concursosActivos = new ArrayList<>();

		Concursos concursos = new Concursos(this.leerConcursos());

		concursos.concursosActivos();

//		for (String string : concursosLista) {
//			String[] concurso = string.split(",");
//			String[] anioMesDiaIncio = concurso[2].split("/");
//			String[] anioMesDiaFin = concurso[3].split("/");
//			int anoInicio = Integer.parseInt(anioMesDiaIncio[0].trim());
//			int mesInicio = Integer.parseInt(anioMesDiaIncio[1]);
//			int diaInicio = Integer.parseInt(anioMesDiaIncio[2]);
//			int anoFin = Integer.parseInt(anioMesDiaFin[0].trim());
//			int mesFin = Integer.parseInt(anioMesDiaFin[1]);
//			int diaFin = Integer.parseInt(anioMesDiaFin[2]);
//
//			LocalDate fechaInicio = LocalDate.of(anoInicio, mesInicio, diaInicio);
//			LocalDate fechaFin = LocalDate.of(anoFin, mesFin, diaFin);
//
//			this.estaActivo(fechaInicio, fechaFin, string, concursosActivos);
//
//		}

		return concursos.concursosActivos();

	}

	private void estaActivo(LocalDate fechaInicio, LocalDate fechaFin, String string, List<String> concursosActivos) {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isAfter(fechaInicio)) && fechaActual.isBefore(fechaFin)) {
			concursosActivos.add(string);
		}

	}

}
