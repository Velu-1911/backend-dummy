package com.example.demoLearn.Service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoLearn.Repository.StudentRepository;
import com.example.demoLearn.StudentPojo.Student;


@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}



	public List<Student> getStudents(){
		 return studentRepository.findAll();
	}



	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
	}


}
