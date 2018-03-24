package com.vidvaan.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.vidvaan.spring.mvc.bean.Employee;
import com.vidvaan.spring.mvc.service.EmployeeService;
import com.vidvaan.spring.mvc.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeValidator validator;

	@RequestMapping(value = "/regForm.html")
	public String showForm(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute(employee);
		return "registration";
	}

	@RequestMapping(value = "/registration.html")
	public String registration(@ModelAttribute("employee") Employee command ,BindingResult result ) {
		validator.validate(command, result);
		if (result.hasErrors())
			return "registration";
		return "success";
    }

//	@RequestMapping(value = "/registration.html")
//	public String processSubmit(@ModelAttribute("employee") Employee employee) {
//		return "success";
//	}

}
