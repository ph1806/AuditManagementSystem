package com.mfpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.repository.ProjectManagerRepo;
import com.mfpe.model.ProjectManager;

@Service
public class ProjectManagerService {

	@Autowired
	private ProjectManagerRepo projectManagerRepo;
	
	public ProjectManager getProjectManagerByUserName(String username) {
		ProjectManager projectManager = null;
		projectManager = projectManagerRepo.getProjectManagerByUserName(username);
		if(projectManager==null) {
			
		}
		return projectManager;
	}
}
