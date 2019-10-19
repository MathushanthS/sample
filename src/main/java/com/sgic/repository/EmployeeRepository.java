package com.sgic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sgic.entity.Employee;
import com.sgic.entity.Project;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("From Employee where id=:id")
	Employee getById(Long id);

//	void save(Employee employee);

}
