package cs.se.project.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cs.se.project.project.Model.Project;
import cs.se.project.project.services.projectService.ProjectServices;

/**
 * ProjectController
 */
@RestController
public class ProjectController {

    @Autowired
    private ProjectServices projectServices;


    @PostMapping("/project/add")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project addProject = projectServices.addProject(project);
        return new ResponseEntity<>(addProject, HttpStatus.ACCEPTED);
        

    }

    @GetMapping("/project/all")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectServices.getAllProject();
        return new ResponseEntity<>(projects, HttpStatus.OK);

    }


    
}