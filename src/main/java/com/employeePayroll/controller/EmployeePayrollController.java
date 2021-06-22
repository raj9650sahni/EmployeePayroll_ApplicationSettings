package com.employeePayroll.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeePayroll.DTO.EmployeePayrollDTO;
import com.employeePayroll.DTO.ResponseDTO;
import com.employeePayroll.model.EmployeePayrollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		EmployeePayrollData employeepayrollData =null;
		employeepayrollData =  new EmployeePayrollData(1,new EmployeePayrollDTO("RAJ", 30000));
		ResponseDTO responseDto = new ResponseDTO("Get call Success", employeepayrollData);
		return new ResponseEntity<ResponseDTO>(responseDto ,HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
		EmployeePayrollData employeepayrollData =null;
		employeepayrollData =  new EmployeePayrollData(empId,new EmployeePayrollDTO("RAJ", 30000));
		ResponseDTO responseDto = new ResponseDTO("Get call Success", employeepayrollData);
		return new ResponseEntity<ResponseDTO>(responseDto ,HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO emppayrollDTO) {
		EmployeePayrollData employeePayrolldata=null;
		employeePayrolldata = new EmployeePayrollData(1,emppayrollDTO);
		ResponseDTO responseDto = new ResponseDTO("Employee created successfully", employeePayrolldata);
		return new ResponseEntity<ResponseDTO>(responseDto,HttpStatus.OK);
		
	}
		
	
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO emppayrollDTO, @PathVariable("empId") int empId){
		EmployeePayrollData employeePayrolldata=null;
		employeePayrolldata = new EmployeePayrollData(empId,emppayrollDTO);
		ResponseDTO responseDto = new ResponseDTO("Employee UpDated", employeePayrolldata);
		return new ResponseEntity<ResponseDTO>(responseDto,HttpStatus.OK);		
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		ResponseDTO responseDto = new ResponseDTO("Employee Deleted Successfully", "Deleted Id :" +empId );
		return new ResponseEntity<ResponseDTO>(responseDto,HttpStatus.OK);
	}

}
