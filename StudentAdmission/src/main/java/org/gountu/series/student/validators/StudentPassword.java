package org.gountu.series.student.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = StudentPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StudentPassword {

	String message() default "please enter the student password properly";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
