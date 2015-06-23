package org.benjamin.spring.model;

public class JavaWork {
	private Tester tester;
	
	public void setTester(Tester tester) {
		this.tester = tester;
	}

	public void doTest(){
		/*ZhangSan zhangsan=new ZhangSan();
		zhangsan.test();*/
		tester.test();
	}
}
