package com.hexaware.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.entity.BugRequest;
import com.hexaware.service.BugService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
public class BugController {
	@Autowired
	BugService bugService;
	@RequestMapping(method = RequestMethod.GET, value = "/bug/{id}")
	public void getBug(@PathVariable Long id) {
		System.out.println("get bug called");
		System.out.println("bug id"+id);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/bug") //endpoint = path + METHOD
	public void getAllBug() {
		System.out.println("get all bugs called");
	}
	@RequestMapping(method = RequestMethod.POST, value = "/bug")
	@ApiOperation(consumes = "application/json", value = "create Bug")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Long createNewBug(@Valid @RequestBody BugRequest bugRequest) throws Exception {
//		response.addHeader("content-type", "application/json123");
		bugService.create(bugRequest);
		return bugRequest.getId();
		
	}
	@ExceptionHandler(Exception.class)
	public void handleException(){
		System.out.println("handled exception");
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/bug/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void updateBug(@RequestBody BugRequest bugRequest, @PathVariable Long id) {

	}
}
