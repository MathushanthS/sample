package com.sgic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


import com.sgic.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

	@Query("From Project where id=:id")
	Project getById(Long id);

	void save(Long id);

}
