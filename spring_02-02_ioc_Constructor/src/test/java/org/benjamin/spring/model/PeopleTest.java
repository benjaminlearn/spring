package org.benjamin.spring.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
	static ApplicationContext ac;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHelloWorld() {
		// Property
		People people2=(People)ac.getBean("people.property");
		System.out.println(people2);
		
		// Constructor Arguments - Type
		People people3=(People)ac.getBean("people.constructor-arg.type");
		System.out.println(people3);
		
		// Constructor Arguments - Index
		People people4=(People)ac.getBean("people.constructor-arg.index");
		System.out.println(people4);
		
		// Constructor Arguments - Index and Type
		People people5=(People)ac.getBean("people.constructor-arg.index.type");
		System.out.println(people5);
		
		// Factory
		People people7=(People)ac.getBean("people.factory");
		System.out.println(people7);
		
		// Static Factory
		People people8=(People)ac.getBean("people.static.factory");
		System.out.println(people8);
	}

}
