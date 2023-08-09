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
		
		//before ������ ó���� ����
		log.info("=======[around before]=======");
		long start = System.currentTimeMillis();
		//���� ȣ��
		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//after ������ ó���� ����
		long end = System.currentTimeMillis();
		log.info("=======[around after]=======" + "ó���� �ҿ�� �ð���" +(end - start) + "�и����Դϴ�.");
		return result;
	}
}
