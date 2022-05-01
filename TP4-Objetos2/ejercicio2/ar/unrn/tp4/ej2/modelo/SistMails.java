package ar.unrn.tp4.ej2.modelo;

import java.util.List;

public class SistMails {

	private MailsEmpleados mailsEmpleados;

	public SistMails(MailsEmpleados mailsEmpleados) {

		this.mailsEmpleados = mailsEmpleados;
	}

	public void enviarMails(List<String> mailsCumpla�eros) {

		for (String string : mailsCumpla�eros) {
			mailsEmpleados.enviarMails(string);
		}

	}

}
