package ar.unrn.tp4.modelo;

public class SistParticipantes implements RepositorioDeParticipantes {

	private PersistenciaDeParticipantes persistencia;

	public SistParticipantes(PersistenciaDeParticipantes persistencia) {

		this.persistencia = persistencia;
	}

	@Override
	public void nuevoParticipante(String nombre, String telefono, String region) {

		Participante participante = new Participante(nombre, telefono, region);
		this.persistencia.insertarParticipante(participante);

	}

}
