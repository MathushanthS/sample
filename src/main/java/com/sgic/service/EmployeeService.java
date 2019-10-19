package com.sgic.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import com.sgic.entity.Employee;


@Service
public interface EmployeeService {
	//public void CreateEmployee(Employee employee);
	//public Employee getByID(Long id);
	public List<Employee> getEmp();
}
