package org.gelm.portal.application;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("studentdetails")
public class StudentDetails 
{
	@XStreamImplicit
	private List<StudentDTO> student;

	public List<StudentDTO> getStudent() {
		return student;
	}

	public void setStudent(List<StudentDTO> student) {
		this.student = student;
	}

}
