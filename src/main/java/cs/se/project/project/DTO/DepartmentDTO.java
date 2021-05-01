package cs.se.project.project.DTO;

import java.util.List;

/**
 * DepartmentDTO
 */
public class DepartmentDTO {

    private Integer id;
    private String name;
    private String location;

    
    private Integer managerId;
    private List<Integer> projectsIds;
    private List<Integer> employeesIds;

    


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getManagerId() {
        return managerId;
    }
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
    public List<Integer> getProjectsIds() {
        return projectsIds;
    }
    public void setProjectsIds(List<Integer> projectsIds) {
        this.projectsIds = projectsIds;
    }
    public List<Integer> getEmployeesIds() {
        return employeesIds;
    }
    public void setEmployeesIds(List<Integer> employeesIds) {
        this.employeesIds = employeesIds;
    }


    
}