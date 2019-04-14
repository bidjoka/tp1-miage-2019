package com.acme.mailreader.presentation;

public class MailInvalideException extends Exception {

	private static final long serialVersionUID = -3371711602820573858L;

	public enum ErreurMail {
		SUJET_TROP_LONG("Sujet trop long");

		ErreurMail(String message) {
			this.message = message;
		}

		private String message;

		public String getMessage() {
			return message;
		}
	}

	public MailInvalideException(ErreurMail erreur) {
		super(erreur.getMessage());
	}

}
