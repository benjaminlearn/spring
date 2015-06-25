package org.benjamin.spring.model;

import org.benjamin.spring.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test1() {
		StudentService studentService=(StudentService)ac.getBean("studentService");
		studentService.addStudent("уехЩ");
	}
}
