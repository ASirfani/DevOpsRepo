package cs.se.project.project.services.projectService;

import java.util.List;

import cs.se.project.project.DTO.ProjectDTO;
import cs.se.project.project.Model.Project;

/**
 * ProjectServices
 */
public interface ProjectServices {

    Project addProject(Project project);

    List<Project> getAllProject();

    List<ProjectDTO> convartToDTO(List<Project> projects);

    Project convartToDTO(Project project);

    Project getProjectById(Integer id);

    
}