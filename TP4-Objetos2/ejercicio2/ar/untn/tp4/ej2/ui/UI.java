package ar.untn.tp4.ej2.ui;

import java.time.LocalDate;

import ar.unrn.tp4.ej2.modelo.Empleado;
import ar.unrn.tp4.ej2.modelo.Empleados;

public class UI {

	public void mostrarVentana() {

		Empleado jose = new Empleado("Jose", "Perez", LocalDate.of(1989, 7, 12), "jperez@si.com");
		Empleado juan = new Empleado("Juan", "Sosa", LocalDate.of(1977, 23, 7), "jsosa@si.com");
		Empleado martin = new Empleado("Martin", "Andia", LocalDate.of(1983, 7, 12), "mandia@si.com");
		Empleado julia = new Empleado("Julia", "Sun", LocalDate.of(1993, 2, 3), "jsun@si.com");

		Empleados empleados = new Empleados();
		empleados.a�adirEmpleado(jose);
		empleados.a�adirEmpleado(juan);
		empleados.a�adirEmpleado(martin);
		empleados.a�adirEmpleado(julia);

	}

}
