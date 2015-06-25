package org.benjamin.spring.model;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class PeopleReplace implements MethodReplacer {

	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		Dog dog=new Dog();
		dog.setName("Tom");
		return dog;
	}
}