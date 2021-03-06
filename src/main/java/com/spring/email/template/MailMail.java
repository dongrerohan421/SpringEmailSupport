package com.spring.email.template;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailMail {

	private MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void sendMail(String dear, String content) {

		SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);

		message.setText(String.format(simpleMailMessage.getText(), dear, content));
		mailSender.send(message);
	}

	public MailSender getMailSender() {
		return mailSender;
	}

	public SimpleMailMessage getSimpleMailMessage() {
		return simpleMailMessage;
	}
}
