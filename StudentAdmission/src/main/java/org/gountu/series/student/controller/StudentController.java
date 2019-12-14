package org.gountu.series.student.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.gountu.series.student.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@ModelAttribute
	public void setStudentHeader(Model studentModel) {
		
		studentModel.addAttribute("studentheader", "Student Admission");
		
		List<String> languages=new LinkedList<String>();
		languages.add("Java");languages.add("C");languages.add("c#");
		studentModel.addAttribute("languages", languages);
		
		Map<String,String> skillSet=new HashMap<String, String>();
		skillSet.put("java", "J2SE&J2EE");
		skillSet.put("spring", "Spring Boot and MVC");
		skillSet.put("db", "Oracle");
		studentModel.addAttribute("skillSet", skillSet);
		
		studentModel.addAttribute("exception", "Hello, I am Exception class");
	}
	
	@RequestMapping(path = {"/studentadmission"},method = RequestMethod.GET)
	public ModelAndView displayStudentAdmissionPage(@ModelAttribute("student")Student student,ModelMap studentMap) {
		studentMap.addAttribute("student", new Student());
		return new ModelAndView("StudentAdmission");
	}
	
	@RequestMapping(path = {"/poststudentadmission"},method = RequestMethod.POST)
	public ModelAndView displayStudentAdmissionDetailsPage(@Valid @ModelAttribute("student")Student student,BindingResult studentResult) {
		if(studentResult.hasErrors()) {
			return new ModelAndView("StudentAdmission");
		}
		ModelAndView modelAndView=new ModelAndView("StudentAdmissionDetails");
		return modelAndView;
	}
	@ResponseBody
	@GetMapping(value = {"/allstudents"}) 
	public List<Student> getAllStudents(){
		List<Student> stdlist=new LinkedList<Student>();
		Student std=new Student();
		std.setName("s");std.setPassword("surya");std.setGender("M");std.setLanguage("java");
		stdlist.add(std);
		return stdlist;
	}
}
