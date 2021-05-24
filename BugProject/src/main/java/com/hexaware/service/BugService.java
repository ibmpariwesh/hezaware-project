package com.hexaware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.entity.BugRequest;
@Service
public class BugService {
	@Autowired
	BugRepository bugRepository; 
	public void create(BugRequest bugRequest) {
		System.out.println(bugRequest);
		bugRepository.save(bugRequest);
	}
	
}
