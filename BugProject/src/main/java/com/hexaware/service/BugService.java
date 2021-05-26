package com.hexaware.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.entity.BugRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;
	@Autowired
	EmailClient emailClient;
	@Transactional(rollbackOn = Exception.class, dontRollbackOn = { ArithmeticException.class,
			IllegalArgumentException.class })
	@HystrixCommand(fallbackMethod = "fallback1")
	public void create(BugRequest bugRequest) throws Exception {
		System.out.println(bugRequest);
//		childMethod(bugRequest);
		bugRepository.save(bugRequest);
		emailClient.sendEmail(bugRequest);
//		throw new Exception();
	}
	
	public void fallback1(BugRequest bugRequest) {
		System.out.println("fallback called...");
	}
//	@Transactional(value = TxType.REQUIRES_NEW)
//	public void childMethod(BugRequest bugRequest) {
//		
//	}

}
