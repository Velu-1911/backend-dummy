package com.example.demoLearn;

import java.time.LocalDate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoLearn.StudentPojo.Student;

@SpringBootApplication
public class DemolearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemolearnApplication.class, args);
	}
	
	
	

}
