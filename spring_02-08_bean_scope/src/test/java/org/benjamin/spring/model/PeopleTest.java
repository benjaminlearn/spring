package org.benjamin.spring.model;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
	private ApplicationContext ac;
	@Before
	public void setUp() throws Exception {
		ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test1() {
		Dog dog=(Dog)ac.getBean("dog");
		Dog dog2=(Dog)ac.getBean("dog");
		System.out.println(dog==dog2);
	}
}
