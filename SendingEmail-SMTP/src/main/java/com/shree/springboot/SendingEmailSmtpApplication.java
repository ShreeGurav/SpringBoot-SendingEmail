package com.shree.springboot;

import com.shree.springboot.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendingEmailSmtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailSmtpApplication.class, args);
	}


}
