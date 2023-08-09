package com.yedam.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
//@Component
public class ReturnAdvice {
	@AfterReturning(pointcut = "LogAdvice.allpointcut()", returning = "obj")
	public void afterLog(JoinPoint jp, Object obj) {
		String name = jp.getSignature().getName();
		log.info(name + "==================[after]==================");
		log.info("return value : " + obj);
		
	}
	
}
