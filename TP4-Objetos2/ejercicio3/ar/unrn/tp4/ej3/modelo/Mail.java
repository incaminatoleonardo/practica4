package ar.unrn.tp4.ej3.modelo;

public class Mail {

	private String mail;

	public Mail(String mail) {
		if (!checkEmail(mail)) {
			throw new RuntimeException("email debe ser válido");

		}
		this.mail = mail;
	}

	private boolean checkEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	@Override
	public String toString() {
		return mail;
	}

}
