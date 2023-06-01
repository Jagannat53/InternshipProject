package com.atdev.student.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atdev.student.entity.Student;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}
	
	public void deleteStudentByid(Integer id) {
		studentRepository.deleteById(id);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
}
