package org.benjamin.spring.service.impl;

import java.util.List;

import org.benjamin.spring.dao.StudentDao;
import org.benjamin.spring.model.Student;
import org.benjamin.spring.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	public int deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	public List<Student> findStudents() {
		return studentDao.findStudents();
	}

	

}
