package com.jan.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jan.core.model.Project;
import com.jan.core.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@GetMapping("/")
	public String get() {
		return "Succss";
	}
	
	@PostMapping(path="/postProject")
	public void getPostedProject(@RequestBody Project project) {
		System.out.println(project);
		projectService.storeProject(project);
		
	}
}
