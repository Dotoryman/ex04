package com.yedam.app.security;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class PasswordEncodingTest {
	
	@Test
	public void test() {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(10);
		String pass = bcrypt.encode("1234");
		
		assertEquals(bcrypt.matches("1234", pass), true);
		log.info("암호화된 비밀번호는 : " + pass);
	}
}
