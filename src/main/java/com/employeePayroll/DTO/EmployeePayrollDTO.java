package com.employeePayroll.DTO;

import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

public class EmployeePayrollDTO {
	
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
