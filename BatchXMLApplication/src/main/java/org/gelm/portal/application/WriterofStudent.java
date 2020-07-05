package org.gelm.portal.application;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class WriterofStudent implements ItemWriter<Students>
{
    @Override
    public void write(List<? extends Students> items) throws Exception 
    {
        items.stream().forEach
        (
        		i
        		-> 
        		{
        		System.err.println(i.getId()+"\t");
        		for(Course c:i.getCourses().getCourse()) {
        			System.out.println(c.getCourseCode()+"\t"+c.getCourseName());
        		}
        		for(StudentDTO s:i.getStudentdetails().getStudent()) {
        			System.out.println(s.getEmailAddress()+"\t"+s.getName());
        		}
        		}
        );
        
        
        
    }
}