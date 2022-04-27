package ar.unrn.tp4.main;

import ar.unrn.tp4.bd.JdbcParticipante;
import ar.unrn.tp4.modelo.SistParticipantes;
import ar.unrn.tp4.ui.UIAgregarParticipante;

public class MainNuevo {

	public static void main(String[] args) {

		UIAgregarParticipante uiParticipante = new UIAgregarParticipante(new SistParticipantes(new JdbcParticipante()));

		uiParticipante.setupUIComponents();

	}

}
