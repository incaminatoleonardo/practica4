package ar.unrn.tp4.modelo;

public class SistParticipantes implements RepositorioDeParticipantes {

	private PersistenciaDeParticipantes persistencia;

	public SistParticipantes(PersistenciaDeParticipantes persistencia) {

		this.persistencia = persistencia;
	}

	@Override
	public void nuevoParticipante(String nombre, String telefono, String region) { // no abusar de los primitivos

//		if (nombre.equals("")) { // las validaciones van en el modelo
//
//			throw new RuntimeException("Debe cargar un nombre");
//			// JOptionPane.showMessageDialog(this, "Debe cargar un nombre");
//			// return;
//		}
//		if (telefono.equals("")) {
//
//			throw new RuntimeException("Debe cargar un telefono");
//			// JOptionPane.showMessageDialog(this, "Debe cargar un telefono");
//			// return;
//		}
//		if (!validarTelefono(telefono)) {
//
//			throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN\"");
//			// JOptionPane.showMessageDialog(this, "El teléfono debe ingresarse de la
//			// siguiente forma: NNNN-NNNNNN");
//			// return;
//		}
//		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
//
//			throw new RuntimeException("Region desconocida. Las conocidas son: China, US, Europa");
//			// JOptionPane.showMessageDialog(this, "Region desconocida. Las conocidas son:
//			// China, US, Europa");
//			// return;
//		}

		Participante participante = new Participante(nombre, telefono, region);
		this.persistencia.insertarParticipante(participante);

	}

//	private boolean validarTelefono(String telefono) { // esto va en la clase telefono
//		String regex = "\\d{4}-\\d{6}";
//		return telefono.matches(regex);
//	}

}
