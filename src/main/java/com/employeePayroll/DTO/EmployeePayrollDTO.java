package com.employeePayroll.DTO;

import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

public class EmployeePayrollDTO {
	
	public String name;
	public long salary;
	public int empId;
	
	public EmployeePayrollDTO(String name,long salary,int empId) {
		
		
		this.name= name;
		this.salary=salary;
		this.empId=empId;
	}
	
	public String toString() {
		return "Employee[name = " + name + ", salary =" + salary + "empId = " + empId +"]";
	}

}
