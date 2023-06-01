package com.atdev.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atdev.student.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
