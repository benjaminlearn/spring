package org.benjamin.spring.model;

import java.util.List;

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
	public void addStudent() {
		StudentService studentService=(StudentService)ac.getBean("studentService");
		int addNums=studentService.addStudent(new Student("����", 1));
		if(addNums==1){
			System.out.println("��ӳɹ�");
		}
	}
	
	@Test
	public void updateStudent() {
		StudentService studentService=(StudentService)ac.getBean("studentService");
		int updateNums=studentService.updateStudent(new Student(12,"����2", 2));
		if(updateNums==1){
			System.out.println("���³ɹ�");
		}
	}
	
	@Test
	public void deleteStudent() {
		StudentService studentService=(StudentService)ac.getBean("studentService");
		int deleteNums=studentService.deleteStudent(12);
		if(deleteNums==1){
			System.out.println("ɾ���ɹ�");
		}
	}
	
	@Test
	public void findStudents() {
		StudentService studentService=(StudentService)ac.getBean("studentService");
		List<Student> studentList=studentService.findStudents();
		for(Student student:studentList){
			System.out.println(student);
		}
	}
}
