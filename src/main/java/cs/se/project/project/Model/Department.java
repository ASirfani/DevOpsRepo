package cs.se.project.project.Model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Department
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Department {

    //attribute of class
    private Integer id;
    private String name;
    private String location;


    /**
     * One to Many
     * Relation Ship between Project with Department class
     * Getter and Setter class of set<projecet>
    */
    
    private Set<Project> projects;
   
    @JsonBackReference
    @OneToMany( mappedBy = "department" )
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }


    /*
    *  One to one Relationship between Department and Employee Class
    * Getter and Setter Enployee class 
    */
    private Employee manager;

    @OneToOne
    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }


    /* 
      One To many relationship between department and employee class

    */

    private Set<Employee> employees;

    @OneToMany(mappedBy = "workingDepartment")
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

   
    


    /* Getter ans Setter all attribute */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    

    

    
    
    
    
}