package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Name cannot be null")
	@NotEmpty(message = "Name cannot be empty")
	@Pattern(regexp = "^[a-zA-Z]*$", message ="Name must be in alphabate")
	private String Name;
	
	@NotNull(message = "EMPLOYEE ID cannot be null")
	@NotEmpty(message = "EMPLOYEE ID cannot be empty")
	@Pattern(regexp = "^[0-9]*$", message = "employee Id can have only number")
	private String empId;
	
	@NotNull(message = "Department cannot be null")
	@NotEmpty(message = "Department cannot be empty")
	@Pattern(regexp = "^[a-zA-Z0-9]*$", message ="Department can be alpha numeric only")
	private String Department;
	
	@NotNull(message = "Addesrr cannot be null")
	@NotEmpty(message = "Address cannot be empty")
	@Pattern(regexp = "^[a-zA-Z0-9]*$", message ="Address can be alpha numeric only")
	private String Address;
	
	@NotNull(message = "Salary cannot be null")
	@NotEmpty(message = "Salary cannot be empty")
	@Pattern(regexp = "^[0-9]*$",message = "Salary must be in number")
	private String Salary;
	
	@NotNull(message = "Email cannot be null")
	@NotEmpty(message="Email cannot be null")
	@Email(message = "Please enter valid email format like example@email.com")	 
	private String Email;
	
	public Employee() {
		super();

	}
	
		

	



	public Employee(int id,
			@NotNull(message = "Name cannot be null") @NotEmpty(message = "Name cannot be empty") @Pattern(regexp = "^[a-zA-Z]*$", message = "Name must be in alphabate") String name,
			@NotNull(message = "EMPLOYEE ID cannot be null") @NotEmpty(message = "EMPLOYEE ID cannot be empty") @Pattern(regexp = "^[0-9]*$", message = "employee Id can have only number") String empId,
			@NotNull(message = "Department cannot be null") @NotEmpty(message = "Department cannot be empty") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Department can be alpha numeric only") String department,
			@NotNull(message = "Addesrr cannot be null") @NotEmpty(message = "Address cannot be empty") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Address can be alpha numeric only") String address,
			@NotNull(message = "Salary cannot be null") @NotEmpty(message = "Salary cannot be empty") @Pattern(regexp = "^[0-9]*$", message = "Salary must be in number") String salary,
			@NotNull(message = "Email cannot be null") @NotEmpty(message = "Email cannot be null") @javax.validation.constraints.Email(message = "Please enter valid email format like example@email.com") String email) {
		super();
		this.id = id;
		Name = name;
		this.empId = empId;
		Department = department;
		Address = address;
		Salary = salary;
		Email = email;
	}







	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String Salary) {
		this.Salary = Salary;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", Name=" + Name + ", empId=" + empId + ", Department="
				+ Department + ", Address=" + Address + ", Salary=" + Salary + ", Email=" + Email + "]";
	}
	
	
	
}
