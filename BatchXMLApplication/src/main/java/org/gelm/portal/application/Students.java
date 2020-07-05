package org.gelm.portal.application;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("students")
public class Students 
{
	private String id;
	private Courses courses;
	private StudentDetails studentdetails;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StudentDetails getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(StudentDetails studentdetails) {
		this.studentdetails = studentdetails;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
}
