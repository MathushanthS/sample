package com.sgic.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.entity.Project;
import com.sgic.exception.ResourceNotFoundException;
import com.sgic.repository.ProjectRepository;
import com.sgic.service.ProjectService;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
//	@Autowired
//	ProjectRepository projectRepository;

	@Autowired
	ProjectService projectService;

	@PostMapping(value = "/project")
	public ResponseEntity<?> createProject(@RequestBody Project project) {
		// projectRepository.save(project);
		projectService.createProject(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	

	@GetMapping(value = "/project/{id}")
	public Project getById(@PathVariable("id") Long id) {

		return projectService.getByIdProject(id);

	}
	

	@GetMapping("/project")
	public List<Project> getProject() {
		
	return projectService.getProject();

	}

	@PutMapping("/updateproject/{id}")
	public void updateProjecT(@PathVariable("id") Long id,Project project) {
		projectService.UpdateProject(project,id);
	}

//	@PutMapping("/project/{projectId}")
//	public void updateProject(@Valid @RequestBody Project project) {
//		 projectRepository.save(project);
//	}

	
	@DeleteMapping("/project/{id}")
	public void deleteProject(@PathVariable("id") Long id) {

		projectService.DeleteProject(id);

	}

}
