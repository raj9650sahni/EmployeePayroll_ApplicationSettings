package com.employeePayroll.service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.employeePayroll.DTO.EmployeePayrollDTO;
import com.employeePayroll.model.EmployeePayrollData;

@Service
public class EmployeepayrollService implements IEmployeepayrollService {
	
	@Override
	public java.util.List<EmployeePayrollData> getEmployeePayrollData() {
		java.util.List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Raj", 300000)));

		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empid) {
		EmployeePayrollData empdata = null;
		empdata = new EmployeePayrollData(empid,new EmployeePayrollDTO("Raj",300000));
		return empdata;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata=null;
		empdata = new EmployeePayrollData(1,empPayrollDTO);
		
		
		return empdata;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empdata=null;
		empdata= new EmployeePayrollData(empId,empPayrollDTO);
		return  empdata;
	}

	@Override
	public void deleteEmployeepayrollData(int empId) {
		
	}

	


}
