package com.hexaware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.entity.BugRequest;
import com.hexaware.service.BugService;

@RestController
public class BugController {
	@Autowired
	BugService bugService;
	@RequestMapping(method = RequestMethod.GET, value = "/bug/{id}")
	public void getBug(@PathVariable Long id) {
		System.out.println("get bug called");
		System.out.println("bug id"+id);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/bug")
	public void getAllBug() {
		System.out.println("get all bugs called");
	}
	@RequestMapping(method = RequestMethod.POST, value = "/bug")
	public void createNewBug(@RequestBody BugRequest bugRequest) {
		bugService.create(bugRequest);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/bug/{id}")
	public void updateBug(@RequestBody BugRequest bugRequest, @PathVariable Long id) {
		System.out.println("update bug called");
		System.out.println(bugRequest.toString());
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/bug/{id}")
	public void deleteBug(@PathVariable Long id) {
		System.out.println("update bug called");
	}
}
