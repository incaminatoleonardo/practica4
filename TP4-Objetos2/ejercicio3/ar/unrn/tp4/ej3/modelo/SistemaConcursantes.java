package ar.unrn.tp4.ej3.modelo;

public class SistemaConcursantes implements RepositorioInscriptos {

	private PersistenciaConcursantes persistencia;

	public SistemaConcursantes(PersistenciaConcursantes persistencia) {

		this.persistencia = persistencia;
	}

	@Override
	public void inscribirConcursante(String nombre, String apellido, String dni, String telefono, String mail,
			int idconcurso) {
		Concursante concursante = new Concursante(nombre, apellido, dni, telefono, mail, idconcurso);
		this.persistencia.registrar(concursante);

	}

}
