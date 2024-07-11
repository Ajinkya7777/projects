package com.infybuzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.dto.StudentDTO;
import com.infybuzz.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/create")
	public StudentDTO createStudent(@RequestBody StudentDTO studentDto) {
		studentDto = studentService.createStudent(studentDto);
		return studentDto;
	}

	@GetMapping("/getById/{id}")
	public StudentDTO getById(@PathVariable("id") long id) {
		StudentDTO studentDto = studentService.getById(id);

		return studentDto;
	}

}
