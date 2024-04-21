package com.example.servicie;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.StudentRepository;

public class StudentServices {
	@Autowired
	StudentRepository studentRepository;
	
	public ResponseEntity<List<Student>> getAllStudents(){
	
		return new ResponseEntity<>(studentRepository.findAll(), httpStatus.OK);
	}
	

}
