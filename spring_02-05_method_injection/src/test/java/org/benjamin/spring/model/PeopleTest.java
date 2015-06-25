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
		People people=(People)ac.getBean("people.method");
		People people2=(People)ac.getBean("people.method");
		System.out.println(people.getDog()==people2.getDog());
		
		System.out.println(ac.getBean("dog")==ac.getBean("dog"));
	}
}
