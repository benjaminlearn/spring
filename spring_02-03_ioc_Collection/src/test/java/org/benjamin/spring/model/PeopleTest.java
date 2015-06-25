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

	// 基本类型值
	// Basic type
	@Test
	public void test1() {
		People people=(People)ac.getBean("default.people");
		System.out.println(people);
	}
	
	// 注入bean
	@Test
	public void test2() {
		People people=(People)ac.getBean("people.bean");
		System.out.println(people);
	}
	
	
	// 内部bean
	@Test
	public void test3() {
		People people=(People)ac.getBean("people.inner.bean");
		System.out.println(people);
	}
	
	// 注入null
	@Test
	public void test4() {
		People people=(People)ac.getBean("people.null");
		System.out.println(people);
	}
	
	// 级联属性
	@Test
	public void test5() {
		People people=(People)ac.getBean("people5");
		System.out.println(people);
	}
	
	// 注入集合
	@Test
	public void test6() {
		People people=(People)ac.getBean("people.collection");
		System.out.println(people);
	}
}
