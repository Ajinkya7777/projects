package com.infybuzz.service;

import com.infybuzz.dto.StudentDTO;

public interface StudentService {

	public StudentDTO createStudent(StudentDTO studentDto);
	
	public StudentDTO getById(long id);
	
	
}
