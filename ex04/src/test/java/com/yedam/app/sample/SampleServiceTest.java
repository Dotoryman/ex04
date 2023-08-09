package com.yedam.app.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.sample.service.SampleService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*-context.xml"})
@Slf4j
public class SampleServiceTest {
	@Autowired
	SampleService service;
	
	@Test
	public void testLong() {
		String str = "HOcHI!HOcHI!HOcHI!";
//				+ "HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!HOcHI!";
		service.addData(str);
	}
}
