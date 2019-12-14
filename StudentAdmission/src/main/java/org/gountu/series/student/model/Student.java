package org.gountu.series.student.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.gountu.series.student.validators.StudentPassword;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
public class Student 
{
	@NotBlank
	private String name;
	@NotBlank
	@Size(min = 6,max = 10)
	@StudentPassword
	private String password;
	@NotBlank
	private String gender;
	@NotBlank
	@Size(min = 6,max = 10,message = "Student mobile no between {min} and {max} digits")
	private String mobileNo;
	
	@NotNull(message = "{student.dob.error.msg}")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dob;
	
	@NotEmpty(message = "Student Skill Set is mandatory")
	private List<String> skillSet;
	
	private Address address;
	
	private String language;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate  dob) {
		this.dob = dob;
	}
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
