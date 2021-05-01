package cs.se.project.project.services.projectService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.se.project.project.DTO.ProjectDTO;
import cs.se.project.project.Model.Project;
import cs.se.project.project.repository.ProjectRespository;

/**
 * ProjectServiceImp
 */
@Service
public class ProjectServiceImp implements ProjectServices{

    @Autowired
    private ProjectRespository projectRespository;

    @Autowired
    private ModelMapper modelMapper;

    
    @Override
    public Project addProject(Project project) {
        return projectRespository.save(project);
    }


    @Override
    public List<Project> getAllProject() {

        return projectRespository.findAll();
    }


    @Override
    public List<ProjectDTO> convartToDTO(List<Project> projects) {
        List<ProjectDTO> projectDTOList = new ArrayList<>();

        for(Project project:projects){

            ProjectDTO projectDTO = modelMapper.map(project , ProjectDTO.class);
            projectDTO.setEmployeesIds(project.getEmployees().stream().map(employee -> employee.getId()).collect(Collectors.toList()));
            projectDTOList.add(projectDTO);

        }
        return projectDTOList;
    }


    @Override
    public Project convartToDTO(Project project) {
        return null;
    }


    @Override
    public Project getProjectById(Integer id) {
      
        return projectRespository.getOne(id);
    }



    
}