package ar.unrn.tp4.ej3.modelo;

import java.util.List;

public class SistemaConcursos {

	private RepositorioConcursos repo;

	public SistemaConcursos(RepositorioConcursos repo) {

		this.repo = repo;
	}

	public List<String> leerConcursos() {

		return this.repo.leerConcursos();
	}

	public List<String> concursosActivos() {

		return null;
	}

}
