package com.yedam.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect //advice
//@Component //�� ���
@Log4j  
public class LogAdvice {
	
	@Pointcut("execution(* com.yedam.app..impl.*Impl.*(..))")
	public void allpointcut() {}
	
	@Before("allpointcut()" )
	public void logBefore(JoinPoint jp) {
		String name = jp.getSignature().getName();
		log.info(name + "==================[before]==================");
		
		log.info("parameter : ");
		Object[] args = jp.getArgs();
		if(args != null) {
			for(Object obj: args) {
				// �Ű����� ������Ÿ�԰� ��
				log.info(obj.getClass().getName() + " : " + obj);
			}
		}
	}
}
