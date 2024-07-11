package com.infybuzz.dto;

import com.infybuzz.entity.Student;

public class StudentDTO {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private AddressDTO addressDTO;

	public StudentDTO(Student studentEntity) {
		this.id = studentEntity.getId();
		this.firstName = studentEntity.getFirstName();
		this.lastName = studentEntity.getLastName();
		this.email = studentEntity.getEmail();

	}

	public StudentDTO() {

	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
