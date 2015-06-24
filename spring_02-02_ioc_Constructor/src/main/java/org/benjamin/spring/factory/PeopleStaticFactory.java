package org.benjamin.spring.factory;

import org.benjamin.spring.model.People;

public class PeopleStaticFactory {
	public static People createPeople(){
		People p=new People();
		p.setId(5);
		p.setName("С��");
		p.setAge(88);
		return p;
	}
}
