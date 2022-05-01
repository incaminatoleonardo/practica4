package main;

import java.time.LocalDate;

import ar.unrn.tp4.ej2.modelo.Empleados;
import ar.unrn.tp4.ej2.modelo.SistMails;
import ar.unrn.tp4.ej2.persistencia.AccesoArchivo;
import ar.unrn.tp4.ej2.servivcios.ServicioMails;

public class Main {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.of(2022, 9, 11);

		Empleados empleados = new Empleados(new AccesoArchivo());
		SistMails sistemaMail = new SistMails(new ServicioMails());

		empleados.enviarMailsCumple(fecha, sistemaMail);

	}

}
