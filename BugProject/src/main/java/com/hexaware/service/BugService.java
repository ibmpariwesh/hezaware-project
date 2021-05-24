package com.hexaware.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.entity.BugRequest;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;

	@Transactional(rollbackOn = Exception.class, dontRollbackOn = { ArithmeticException.class,
			IllegalArgumentException.class })
	public void create(BugRequest bugRequest) throws Exception {
		System.out.println(bugRequest);
//		childMethod(bugRequest);
		bugRepository.save(bugRequest);
//		throw new Exception();
	}
//	@Transactional(value = TxType.REQUIRES_NEW)
//	public void childMethod(BugRequest bugRequest) {
//		
//	}

}
