package com.jan.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jan.core.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
