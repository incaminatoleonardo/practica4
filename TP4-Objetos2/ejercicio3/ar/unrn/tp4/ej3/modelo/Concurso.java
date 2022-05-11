package ar.unrn.tp4.ej3.modelo;

import java.time.LocalDate;
import java.util.List;

public class Concurso {

	private int idconcurso;
	private String nombre;
	private LocalDate fechaInicioInscripcion;
	private LocalDate fechaFinInscripcion;

	public Concurso(int idconcurso, String nombre, LocalDate fechaInicioInscripcion, LocalDate fechaFinInscripcion) {

		this.idconcurso = idconcurso;
		this.nombre = nombre;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinInscripcion = fechaFinInscripcion;
	}

	@Override
	public String toString() { // 1, concurso x, 2020/06/01, 2020/07/01
		return idconcurso + ", " + nombre + ", " + fechaInicioInscripcion + ", " + fechaFinInscripcion;
	}

	public List<Concurso> estaActivoAgregalo(Concurso concurso, List<Concurso> concursosActivos) {

		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isAfter(fechaInicioInscripcion)) && fechaActual.isBefore(fechaFinInscripcion)) {
			concursosActivos.add(concurso);
		}
		return concursosActivos;
	}

}
