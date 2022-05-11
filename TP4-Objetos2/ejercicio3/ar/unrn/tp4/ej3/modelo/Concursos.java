package ar.unrn.tp4.ej3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Concursos {

	private List<Concurso> concursos;

	public Concursos(List<Concurso> concursos) {

		this.concursos = concursos;
	}

	public List<Concurso> concursosActivos() {

		List<Concurso> concursosActivos = new ArrayList<>();

		for (Concurso concurso : concursos) {
			concursosActivos = concurso.estaActivoAgregalo(concurso, concursosActivos);
			// concursosActivos.add(concurso.estaActivoAgregalo(concurso));
		}

		return concursosActivos;
	}

}
