package ar.unrn.tp4.ej2.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleados { // PREGUNTAR SI TODO ESTO VA EN SistMails

	private PersistenciaEmpleados empleados;

	public Empleados(PersistenciaEmpleados empleados) {

		this.empleados = empleados;
	}

	public void enviarMailsCumple(LocalDate fecha, SistMails sistemaMails) {

		List<String> empleados = this.leerEmpleados();

		List<String> mailsCumpla�eros = new ArrayList<>();
		for (String string : empleados) {
			String[] empleado = string.split(",");
			String[] anioMesDia = empleado[2].split("-");
			int mes = Integer.parseInt(anioMesDia[1]);
			int dia = Integer.parseInt(anioMesDia[2]);
			String mail = empleado[3];

			this.agregarmails(mes, dia, mail, fecha, mailsCumpla�eros);

		}

		if (mailsCumpla�eros.size() >= 0) {
			sistemaMails.enviarMails(mailsCumpla�eros);
		}

	}

	private void agregarmails(int mes, int dia, String mail, LocalDate fecha, List<String> mailsCumpla�eros) {

		if (this.esElCumplea�os(mes, dia, fecha)) {
			mailsCumpla�eros.add(mail);

		}

	}

	private boolean esElCumplea�os(int mes, int dia, LocalDate fecha) {

		int mesAcutal = fecha.getMonthValue();
		int diaActual = fecha.getDayOfMonth();

		if (dia == diaActual && mes == mesAcutal) {
			return true;
		}

		return false;
	}

	public List<String> leerEmpleados() {
		return this.empleados.leerEmpleados();
	}

}
