package com.employeePayroll.model;

import com.employeePayroll.DTO.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {
	
	private String name;
	private int empId;
	private long salary;
	public EmployeePayrollData( int empId, EmployeePayrollDTO empPayrollDTO) {
		super();
		this.name =empPayrollDTO.name;
		this.empId = empId;
		this.salary =empPayrollDTO.salary;
	}
	

	
}
