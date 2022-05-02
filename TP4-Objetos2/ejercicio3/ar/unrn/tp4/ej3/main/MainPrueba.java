package ar.unrn.tp4.ej3.main;

import java.util.List;

import ar.unrn.tp4.ej3.modelo.SistemaConcursos;
import ar.unrn.tp4.ej3.persistenciaArchivo.AccesoArchivos;

public class MainPrueba {

	public static void main(String[] args) {

		SistemaConcursos concursos = new SistemaConcursos(new AccesoArchivos());

		System.out.println(concursos.leerConcursos().toString());

//		List<String> empleados = this.leerEmpleados();
//
//		List<String> mailsCumplañeros = new ArrayList<>();
//		for (String string : empleados) {
//			String[] empleado = string.split(",");
//			String[] anioMesDia = empleado[2].split("-");
//			int mes = Integer.parseInt(anioMesDia[1]);
//			int dia = Integer.parseInt(anioMesDia[2]);
//			String mail = empleado[3];
//
//			this.agregarmails(mes, dia, mail, fecha, mailsCumplañeros);
//
//		}

		List<String> concursosLista = concursos.leerConcursos();

		for (String string : concursosLista) {
			String[] concurso = string.split(",");
			String[] anioMesDiaInciio = concurso[2].split("/");
			String[] anioMesDiaFin = concurso[3].split("/");
			System.out.println(anioMesDiaInciio[1] + "/" + anioMesDiaInciio[2]);
			System.out.println(anioMesDiaFin[1] + "/" + anioMesDiaFin[2]);
		}

	}

}
