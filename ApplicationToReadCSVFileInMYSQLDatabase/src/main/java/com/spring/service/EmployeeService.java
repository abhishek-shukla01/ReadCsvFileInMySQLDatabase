package com.spring.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.spring.model.Employee;
import com.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRep;
	
	String line ="";
//	@Scheduled(fixedRate = 10000)
	public void  saveEmpDetails() {
		try {
			BufferedReader br =new BufferedReader(new FileReader("src/main/resources/EmployeeDetails.csv"));
			while((line = br.readLine())!=null) {
				String [] data = line.split(",");
				Employee emp = new Employee();
				emp.setName(data[0]);
				emp.setEmpId(data[1]);
				emp.setDepartment(data[2]);
				emp.setAddress(data[3]);
				emp.setSalary(data[4]);
				emp.setEmail(data[5]);
				empRep.save(emp);
				
			}
		
		} catch (Exception e) {
			System.out.println("There is some Error. Look Once again!!");
			System.out.println(e.getMessage());
			System.out.println("Data Cannot be read");
		}
			
		
		
	}
	
	
}
