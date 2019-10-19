package com.sgic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.entity.Employee;
import com.sgic.service.EmployeeService;



@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
//	@Autowired
//	DefectRepostories defectRepostories;
//
//	@Autowired
//	ProjectRepository projectRepostories;
	
	@Autowired
	EmployeeService employeeService;
	
//	@PostMapping(value="/employee")
//	public ResponseEntity<?> CreateEmployee(@RequestBody Employee employee){
//		employeeService.CreateEmployee(employee);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
	
//	@GetMapping(value="/employee/{id}")
//	public Employee getByID(@PathVariable("id") Long id) {
//		return employeeService.getByID(id);
//	}
	
	@GetMapping(value="/employee")
	public List<Employee> getEmployees(){
		return employeeService.getEmp();
	}
	


}
