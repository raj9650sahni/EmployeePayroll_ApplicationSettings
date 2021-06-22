package com.employeePayroll.model;

import com.employeePayroll.DTO.EmployeePayrollDTO;

public class EmployeePayrollData {
	
	private String name;
	private int empId;
	private long salary;
	public EmployeePayrollData( int empId, EmployeePayrollDTO empPayrollDTO) {
		super();
		this.name =empPayrollDTO.name;
		this.empId = empId;
		this.salary =empPayrollDTO.salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	
}
