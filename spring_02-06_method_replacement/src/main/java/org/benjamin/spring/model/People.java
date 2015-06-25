package org.benjamin.spring.model;

public class People {
	private int id;
	private String name;
	private int age;
	private Dog dog;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog getDog() {
		Dog dog=new Dog();
		dog.setName("Jack");
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age
				+ ", dog=" + dog.getName() + "]";
	}
}
