package com.infybuzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.infybuzz.dto.AddressDTO;
import com.infybuzz.dto.StudentDTO;
import com.infybuzz.entity.Student;
import com.infybuzz.mapper.MapperClass;
import com.infybuzz.repository.StudentRepository;

import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;

	@Autowired
	WebClient webClient;

	@Override
	public StudentDTO createStudent(StudentDTO studentDto) {

		Student studentEntity = studentRepo.save(MapperClass.dtoToEntity(studentDto));

		studentDto = new StudentDTO(studentEntity);

		studentDto.setAddressDTO(getAddressById(studentEntity.getAddressId()));

		//return MapperClass.entityToDto(studentEntity);
		
		return studentDto;
	}

	@Override
	public StudentDTO getById(long id) {

		Student student = studentRepo.findById(id).get();

		StudentDTO studentDto = new StudentDTO(student);
		studentDto.setAddressDTO(getAddressById(student.getAddressId()));

		// studentDto.setAddressDTO(this.getAddressById(student.getAddressId()));

		return studentDto;

	}

	public AddressDTO getAddressById(long addressId) {
		Mono<AddressDTO> addressDto = webClient.get().uri("getById/" + addressId).retrieve()
				.bodyToMono(AddressDTO.class);
		return addressDto.block();
	}

}
