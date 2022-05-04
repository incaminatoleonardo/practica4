package ar.unrn.tp4.ej3.main;

import ar.unrn.tp4.ej3.modelo.Concursante;
import ar.unrn.tp4.ej3.modelo.SistemaConcursantes;
import ar.unrn.tp4.ej3.modelo.SistemaConcursos;
import ar.unrn.tp4.ej3.persistenciaArchivo.AccesoArchivos;

public class MainPrueba {

	public static void main(String[] args) {

		SistemaConcursos concursos = new SistemaConcursos(new AccesoArchivos());
		SistemaConcursantes concursantes = new SistemaConcursantes(new AccesoArchivos());

		Concursante con = new Concursante("leo", "inc", "1", "0000-000001", "a@si.com", 1);
		System.out.println(con.toString());

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

//		List<String> concursosLista = concursos.leerConcursos();
//
//		LocalDate fechaActual = LocalDate.now();
//
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
//			System.out.println(anioMesDiaIncio[0] + "/" + anioMesDiaIncio[1] + "/" + anioMesDiaIncio[2]);
//			System.out.println(anioMesDiaFin[0] + "/" + anioMesDiaFin[1] + "/" + anioMesDiaFin[2]);
//			if ((fechaActual.isAfter(fechaInicio)) && fechaActual.isBefore(fechaFin)) {
//				System.out.println("Inscribir participante");
//			}
//
//		}

	}

}
