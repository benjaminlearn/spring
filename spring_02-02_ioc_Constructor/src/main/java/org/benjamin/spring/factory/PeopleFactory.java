package org.benjamin.spring.factory;

import org.benjamin.spring.model.People;

public class PeopleFactory {
	public People createPeople(){
		People p=new People();
		p.setId(5);
		p.setName("Ð¡Æß");
		p.setAge(77);
		return p;
	}
}
