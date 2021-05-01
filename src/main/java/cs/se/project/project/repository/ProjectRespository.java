package cs.se.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.se.project.project.Model.Project;

/**
 * ProjectRespository
 */
@Repository
public interface ProjectRespository extends JpaRepository<Project, Integer> {


    
    
}