package ar.unrn.tp4.ej3.modelo;

public class Concursante {
//String nombre, String apellido, String telefono, String mail, String idconcurso

	private Nombre nombre;
	private Apellido apellido;
	private Dni dni;
	private Telefono telefono;
	private Mail mail;
	private int idconcurso;

	public Concursante(String nombre, String apellido, String dni, String telefono, String mail, int idconcurso) {

		this.nombre = new Nombre(nombre);
		this.apellido = new Apellido(apellido);
		this.dni = new Dni(dni);
		this.telefono = new Telefono(telefono);
		this.mail = new Mail(mail);

		if (idconcurso <= 0) { // ver la validacion de ocmbo box
			throw new RuntimeException("Debe elegir un concurso");
		}
		this.idconcurso = idconcurso;
	}

	@Override
	public String toString() {

		return apellido.toString() + ", " + nombre.toString() + ", " + telefono.toString() + ", " + mail.toString()
				+ ", " + idconcurso + System.lineSeparator();
	}

}
