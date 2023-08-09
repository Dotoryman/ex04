package com.yedam.app.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yedam.app.sample.mapper.BankMapper;
import com.yedam.app.sample.service.BankService;

public class BankServiceImpl  implements BankService{

	@Autowired BankMapper mapper;
	
	@Override
	public void bankTransfer(int value) {
		mapper.deposit(value);
		mapper.withdraw(value);
	}

}
