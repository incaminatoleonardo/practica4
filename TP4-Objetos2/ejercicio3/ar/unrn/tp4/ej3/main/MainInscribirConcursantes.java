package ar.unrn.tp4.ej3.main;

import javax.swing.SwingUtilities;

import ar.unrn.tp4.ej3.modelo.SistemaConcursantes;
import ar.unrn.tp4.ej3.modelo.SistemaConcursos;
import ar.unrn.tp4.ej3.persistenciaArchivo.AccesoArchivos;
import ar.unrn.tp4.ej3.ui.UIInscribirConcursante;
import persistenciaJdbc.JdbcConcurso;

public class MainInscribirConcursantes {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new MainInscribirConcursantes().start();
				} catch (Exception e) {
					// log exception...
					System.out.println(e);
				}
			}
		});
	}

	private void start() {

		SistemaConcursos concursos = new SistemaConcursos(new JdbcConcurso());
		SistemaConcursantes concursantes = new SistemaConcursantes(new AccesoArchivos());

		new UIInscribirConcursante(concursos, concursantes);
	}

}
