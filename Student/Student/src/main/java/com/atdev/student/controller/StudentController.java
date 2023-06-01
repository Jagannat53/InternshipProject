package com.atdev.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.student.entity.Student;
import com.atdev.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id) {
		studentService.deleteStudentByid(id);
	}
	
	@PostMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
}
