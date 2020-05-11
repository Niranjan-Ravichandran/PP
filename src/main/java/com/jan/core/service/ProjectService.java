package com.jan.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jan.core.model.Project;
import com.jan.core.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	public void storeProject(Project project) {
		try {
			projectRepository.save(project);
		}
		catch(Exception | Error e) {
			e.printStackTrace();
		}
	}
}
