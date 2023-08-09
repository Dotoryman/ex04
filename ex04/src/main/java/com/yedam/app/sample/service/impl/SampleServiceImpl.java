package com.yedam.app.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.sample.mapper.Sample1Mapper;
import com.yedam.app.sample.mapper.Sample2Mapper;
import com.yedam.app.sample.service.SampleService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleServiceImpl implements SampleService {
	@Setter(onMethod_ = {@Autowired} )
	private Sample1Mapper mapper1;
	
	@Setter(onMethod_ = {@Autowired} )
	private Sample2Mapper mapper2;

	@Override
	@Transactional
	public void addData(String value) {
		log.info("mapper1");
		mapper1.insertCol1(value); // 500
		log.info("mapper2");
		mapper2.insertCol1(value); // 50
	}

	
	
}
