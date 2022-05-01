package main;

import java.time.LocalDate;
import java.util.List;

import ar.unrn.tp4.ej2.persistencia.AccesoArchivo;

public class MainPrueba {

	public static void main(String[] args) {

		AccesoArchivo acceso = new AccesoArchivo();

		try {
			List<String> empleados = acceso.leerEmpleados();

			LocalDate fecha = LocalDate.of(2022, 9, 11);
			int mesAcutal = fecha.getMonthValue();
			int diaActual = fecha.getDayOfMonth();

			for (String string : empleados) {
				String[] empleado = string.split(",");
				String[] anioMesDia = empleado[2].split("-");
				int mes = Integer.parseInt(anioMesDia[1]);
				int dia = Integer.parseInt(anioMesDia[2]);
				System.out.println(dia + "-" + mes);
				if (dia == diaActual && mes == mesAcutal) { // esto seria un verificarCumpleaños(mes ,dia)
					System.out.print("Feliz cumple" + " " + empleado[0] + empleado[1]);
					System.out.println("; Enviar mail a" + empleado[3]);
				}
			}
			// System.out.println(empleados);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
