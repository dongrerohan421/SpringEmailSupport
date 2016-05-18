package com.spring.email.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("mailSender/Spring-Mail.xml");
			MailMail mm = (MailMail) context.getBean("mailMail");
			mm.sendMail("from@no-spam.com", "to@no-spam.com", "Spring test email", "Hi, How are you?");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
