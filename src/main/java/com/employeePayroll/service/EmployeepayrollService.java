package com.employeePayroll.service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.employeePayroll.DTO.EmployeePayrollDTO;
import com.employeePayroll.model.EmployeePayrollData;

@Service
public class EmployeepayrollService implements IEmployeepayrollService {
	
	private java.util.List<EmployeePayrollData> empDataList = new ArrayList<>();
	
	@Override
	public java.util.List<EmployeePayrollData> getEmployeePayrollData() {
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empid) {
		return empDataList.get(empid-1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata=null;
		empdata = new EmployeePayrollData(empDataList.size() + 1,empPayrollDTO);
		empDataList.add(empdata);
		return empdata;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata= this.getEmployeePayrollDataById(empId);
		empdata.setName(empPayrollDTO.name);
		empdata.setSalary(empPayrollDTO.salary);
		empDataList.add(empId -1 , empdata);
		return  empdata;
	}

	@Override
	public void deleteEmployeepayrollData(int empId) {
		empDataList.remove(empId -1);
		
	}

	


}
