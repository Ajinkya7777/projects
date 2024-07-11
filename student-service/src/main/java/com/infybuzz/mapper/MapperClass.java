package com.infybuzz.mapper;

import com.infybuzz.dto.StudentDTO;
import com.infybuzz.entity.Student;

public class MapperClass {

	public static Student dtoToEntity(StudentDTO studentDto) {
		Student student = new Student();

		student.setFirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setEmail(studentDto.getEmail());

		return student;
	}

	public static StudentDTO entityToDto(Student student) {
		StudentDTO dto = new StudentDTO();
		dto.setId(student.getId());
		dto.setFirstName(student.getFirstName());
		dto.setLastName(student.getLastName());
		dto.setEmail(student.getEmail());

		return dto;
	}

}
