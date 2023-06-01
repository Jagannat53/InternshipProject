package com.atdev.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atdev.student.entity.Student;
import com.atdev.student.repository.StudentDAO;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public Student addStudent(Student student) {
		return studentDAO.saveStudent(student);
	}

	public List<Student> findAllStudents() {
		return studentDAO.findAllStudents();
	}
	
	public void deleteStudentByid(Integer id) {
		studentDAO.deleteStudentByid(id);
	}

	public Student updateStudent(Student student) {
		return studentDAO.updateStudent(student);
	}
}
