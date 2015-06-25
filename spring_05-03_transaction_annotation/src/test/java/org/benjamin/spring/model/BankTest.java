package org.benjamin.spring.model;

import org.benjamin.spring.service.BankService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void transferAccounts() {
		BankService bankService=(BankService)ac.getBean("bankService");
		bankService.transferAccounts(50, 1, 2);
	}
}
