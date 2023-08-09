package com.yedam.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AroundAdvice {

	@Around("LogAdvice.allpointcut()")
	public Object logTime(ProceedingJoinPoint pjp) {
		
		//before 시점에 처리할 내용
		log.info("=======[around before]=======");
		long start = System.currentTimeMillis();
		//서비스 호출
		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//after 시점에 처리할 내용
		long end = System.currentTimeMillis();
		log.info("=======[around after]=======" + "처리에 소요된 시간은" +(end - start) + "밀리초입니다.");
		return result;
	}
}
