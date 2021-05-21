package com.hexaware.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.entity.BugRequest;

@RestController
public class BugController {
	@RequestMapping(method = RequestMethod.GET, value = "/getBug/{id}")
	public void getBug(@PathVariable Long id) {
		System.out.println("get bug called");
		System.out.println("bug id"+id);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/getAllBugs")
	public void getAllBug() {
		System.out.println("get all bugs called");
	}
	@RequestMapping(method = RequestMethod.POST, value = "/createBug")
	public void createNewBug(@RequestBody BugRequest bugRequest) {
		System.out.println("create bug called");
		System.out.println(bugRequest.toString());
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/updateBug")
	public void updateBug(@RequestBody BugRequest bugRequest) {
		System.out.println("update bug called");
		System.out.println(bugRequest.toString());
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteBug/{id}")
	public void deleteBug(@PathVariable Long id) {
		System.out.println("update bug called");
	}
}
