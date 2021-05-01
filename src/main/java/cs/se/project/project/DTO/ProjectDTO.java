package cs.se.project.project.DTO;

import java.util.List;

/**
 * ProjectDTO
 */
public class ProjectDTO {

    private Integer id;
    private String name;
    private String location;

    private Integer departmentId;
    private Integer leaderId;
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
    public List<Integer> getEmployeesIds() {
        return employeesIds;
    }
    public void setEmployeesIds(List<Integer> employeesIds) {
        this.employeesIds = employeesIds;
    }
    public Integer getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    public Integer getLeaderId() {
        return leaderId;
    }
    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    
}