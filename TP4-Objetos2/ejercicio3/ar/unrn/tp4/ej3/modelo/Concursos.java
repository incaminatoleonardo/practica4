package ar.unrn.tp4.ej3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Concursos {

	private List<Concurso> concursos;

	public Concursos(List<Concurso> concursos) {

		this.concursos = concursos;
	}

	public List<Concurso> concursosActivos(List<Concurso> concursos) {

		List<Concurso> concursosActivos = new ArrayList<>();

		for (Concurso concurso : concursosActivos) {
			concurso.estaActivoAgregalo(concurso, concursosActivos);
		}

		return concursosActivos;
	}

}
