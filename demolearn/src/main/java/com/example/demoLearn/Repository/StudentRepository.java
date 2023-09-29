package com.example.demoLearn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoLearn.StudentPojo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
