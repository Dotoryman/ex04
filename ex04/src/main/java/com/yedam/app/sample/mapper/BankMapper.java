package com.yedam.app.sample.mapper;

import org.apache.ibatis.annotations.Select;

public interface BankMapper {
	@Select("")
	int deposit(int money);
	@Select("")
	int withdraw(int money);
}
