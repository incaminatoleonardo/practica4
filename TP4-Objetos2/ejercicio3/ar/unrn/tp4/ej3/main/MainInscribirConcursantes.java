package ar.unrn.tp4.ej3.main;

import javax.swing.SwingUtilities;

import ar.unrn.oop2.programa.RadioCompetition;

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
		new RadioCompetition();
	}

}
