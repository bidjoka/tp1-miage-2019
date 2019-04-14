package com.acme.mailreader.infrastructure;

import java.util.logging.Logger;

import com.acme.mailreader.domain.Mail;
import com.acme.mailreader.service.MailSender;

/**
 * Implementation de production du mail sender
 */
public class SmtpMailSender implements MailSender {

	private Logger logger = Logger.getGlobal();

	public void envoyerMail(Mail mail) {
		logger.info("Envoi d'un mail en SMTP");
		// ... code qui utilise javax.mail...

	}

}
