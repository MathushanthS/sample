package com.sgic.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sgic.entity.Project;

@Service
public interface ProjectService {
	public void createProject(Project project);
	 
	public Project getByIdProject(Long id) ;
	public  List<Project> getProject();
	public void UpdateProject(Project project,Long id);
	public void DeleteProject(Long id);

}
