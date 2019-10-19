package com.sgic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sgic.entity.Project;
import com.sgic.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public void createProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
		
	}

	@Override
	public Project getByIdProject(Long id) {
		// TODO Auto-generated method stub
	
		return 	projectRepository.getById(id);
	}

	@Override
	public List<Project> getProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	@Transactional
	public void UpdateProject(Project project,Long id) {
//		Long proid=project.getId();
//		System.out.println(proid);
//		// TODO Auto-generated method stub
//		if(projectRepository.getById(proid) != null) {
		projectRepository.save(project);
		}

	@Override
	public void DeleteProject(Long id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById( id);
	}

	
	}
	

//}
