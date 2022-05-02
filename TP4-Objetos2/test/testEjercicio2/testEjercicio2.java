package testEjercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ar.unrn.tp4.ej2.modelo.Empleados;
import ar.unrn.tp4.ej2.modelo.SistMails;
import ar.unrn.tp4.ej2.modelo.StubAccesoArchivo;
import ar.unrn.tp4.ej2.modelo.StubEnviarMails;

class testEjercicio2 {

	@Test
	void testLeerArchivo() {

		// SET UP
		Empleados empleados = new Empleados(new StubAccesoArchivo());

		String resultadoEsperado = "[Young, Angus, 1982-10-08, angus@acdc.com, Johnson, Brian, 1975-09-11, brian@acdc.com, Perez, Juan, 1985-09-11, juan@acdc.com, Gomez, Martin, 1986-02-25, martin@acdc.com]";

		// EXERCISE
		String empleadosLeidos = empleados.leerEmpleados().toString();

		// VERIFY
		System.out.println(resultadoEsperado);
		System.out.println(empleadosLeidos);

		assertEquals(resultadoEsperado, empleadosLeidos);

	}

	@Test
	void testEnvioMails() {

		// SET UP
		LocalDate fecha = LocalDate.of(2022, 9, 11);

		Empleados empleados = new Empleados(new StubAccesoArchivo());
		SistMails sistemaMail = new SistMails(new StubEnviarMails());
		StubEnviarMails stubMails = new StubEnviarMails();

		int mailsEsperadosEnviados = 2;

		// EXERCISE
		empleados.enviarMailsCumple(fecha, sistemaMail);
		int mailsEnviados = stubMails.mailsEnviados();

		// VERIFY
		assertEquals(mailsEnviados, mailsEnviados);

	}

}
