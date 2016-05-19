package com.spring.email.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("mailTemplate/Spring-Mail.xml");
			MailMail mm = (MailMail) context.getBean("mailMail");
			mm.sendMail("Yong Mook Kim", "This is text content");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
