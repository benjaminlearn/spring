package org.benjamin.spring.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaWorkTest {
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
	public void testJavaWorkIOCDoTest() {
		JavaWork javaWork=(JavaWork)ac.getBean("javawork");
		javaWork.doTest();
	}

	@Test
	public void testJavaWorkDoTest() {
		JavaWork javaWork=new JavaWork();
		// javaWork.setTester(new ZhangSan());
		javaWork.setTester(new Lisi());
		javaWork.doTest();
	}
}
