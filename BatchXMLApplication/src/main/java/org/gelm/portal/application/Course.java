package org.gelm.portal.application;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("course")
public class Course 
{
	private String courseCode;
	private String courseName;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
