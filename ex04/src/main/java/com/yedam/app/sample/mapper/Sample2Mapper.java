package com.yedam.app.sample.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapper {

	@Insert("insert into tbl_sample2(col) values (#{data})")
	public int insertCol1(String data);
}
