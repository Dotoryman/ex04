package com.yedam.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect //advice
@Component //ºó µî·Ï
@Log4j  
public class LogAdvice {

	@Before("execution(* com.yedam.app..impl.*Impl.*(..))")
	public void logBefore() {
		log.info("==================[before]==================");
	}
}
