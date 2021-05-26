package com.hexaware.email;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {
	@RequestMapping(path = "/email", method=RequestMethod.POST)
	public void sendEmail(@RequestBody BugRequest bugRequest){
		System.out.println(bugRequest);
	}
}
