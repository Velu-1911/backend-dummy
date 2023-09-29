package com.example.demoLearn.Configuration;

import java.time.LocalDate;

import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demoLearn.Repository.StudentRepository;
import com.example.demoLearn.StudentPojo.Student;

@Configuration
public class StudentConfig {
	
	//the below code completes get request of backend to get data but not change them basically to add default values
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args ->{
			
					
					Student velu = new Student(	
							"velu",
							"velu@gmail.com",
							LocalDate.of(2001, Month.NOVEMBER, 19)
							);
					
					Student guru =new Student(
							"guru",
							"guru@gmail.com",
							LocalDate.of(2009,Month.AUGUST, 19)
							);
						
				
					studentRepository.saveAll(List.of(velu,guru));
		};
				
	}
	
	
	
}
