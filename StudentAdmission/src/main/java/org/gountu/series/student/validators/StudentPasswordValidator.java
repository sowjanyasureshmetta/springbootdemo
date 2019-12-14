package org.gountu.series.student.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentPasswordValidator implements ConstraintValidator<StudentPassword, String>{

	@Override
	public boolean isValid(String studentPassword, ConstraintValidatorContext context) {

		Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(studentPassword);
		return m.find();
	}

}
