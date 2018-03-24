package com.vidvaan.spring.mvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vidvaan.spring.mvc.bean.Employee;

@Component
public class EmployeeValidator implements Validator {
	public boolean supports(Class c) {
		return c.equals(Employee.class);
	}

	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "eid", "employee.id");
		ValidationUtils.rejectIfEmpty(errors, "ename", "employee.name");
		ValidationUtils.rejectIfEmpty(errors, "esal", "employee.sal");
		ValidationUtils.rejectIfEmpty(errors, "ecompany", "employee.company");
		Employee employee = (Employee) target;
		if (employee.getEname() != "" && employee.getEname().length() < 6) {
			errors.rejectValue("ename", "name.minlength");
		}
	}
}
