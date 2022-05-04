package ar.unrn.tp4.ej3.modelo;

public interface RepositorioInscriptos {

	void inscribirConcursante(String nombre, String apellido, String dni, String telefono, String mail, int idconcurso);

}
