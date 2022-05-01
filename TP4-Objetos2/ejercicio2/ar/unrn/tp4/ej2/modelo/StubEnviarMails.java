package ar.unrn.tp4.ej2.modelo;

public class StubEnviarMails implements MailsEmpleados {

	private int mailsEnviados;

	public StubEnviarMails() {

	}

	public int mailsEnviados() {
		return this.mailsEnviados;
	}

	@Override
	public void enviarMails(String mail) {

		this.mailsEnviados = this.mailsEnviados + 1;
	}

}
