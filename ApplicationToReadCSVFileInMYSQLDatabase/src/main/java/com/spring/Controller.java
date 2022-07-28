package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.EmployeeService;


@RestController
public class Controller {

	@Autowired
	EmployeeService empSer;
	
	@RequestMapping(path="feedEmployeeData")
	public void feedData() {
		empSer.saveEmpDetails();
	}
}
