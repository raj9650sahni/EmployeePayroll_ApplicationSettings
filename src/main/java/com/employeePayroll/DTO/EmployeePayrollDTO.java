package com.employeePayroll.DTO;

import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import com.sun.istack.NotNull;

//import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

	
	//@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Employee Name Invalid")
	@NotNull
	public String name;
	public long salary;
	
	public EmployeePayrollDTO(String name,long salary) {
		
		
		this.name= name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee[name = " + name + ", salary =" + salary + "]";
	}

}
