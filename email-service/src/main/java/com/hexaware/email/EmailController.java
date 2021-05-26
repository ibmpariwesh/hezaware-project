package com.hexaware.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {
	@Autowired
	MailSender emailSender;
	@RequestMapping(path = "/email", method=RequestMethod.POST)
	public void sendEmail(@RequestBody BugRequest bugRequest){
		System.out.println(bugRequest);
		SimpleMailMessage message =new SimpleMailMessage();;
		message.setFrom("ibmpariwesh@gmail.com");
		message.setTo("pariweshg@gmail.com");
		message.setSubject("Subject yahooooooo.");
		message.setText("This is a text");
		emailSender.send(message);
	}
}
