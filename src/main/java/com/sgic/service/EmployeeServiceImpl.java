package com.sgic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgic.entity.Employee;
import com.sgic.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
//	@Override
//	public void CreateEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		 employeeRepository.save(employee);
//		
//	}

//	@Override
//	public Employee getByID(Long id) {
//		// TODO Auto-generated method stub
//		return employeeRepository.getById(id);
//	}

	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
