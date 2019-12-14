package org.gountu.series.student.propertyeditors;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDOBEditor extends PropertyEditorSupport{

	 public void setAsText(String dob) throws java.lang.IllegalArgumentException {
		 System.out.println(dob);
		 String finalDOB="";
		 SimpleDateFormat parser=new SimpleDateFormat("YYYY-MM-dd");
		 SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-YYYY");
		 try {
			 Date damal=parser.parse(dob);
			 System.out.println(damal);
			 finalDOB=formatter.format(damal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(finalDOB);
		  setValue(finalDOB);
	    }
	
}
