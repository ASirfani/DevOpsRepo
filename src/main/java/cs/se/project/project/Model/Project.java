package cs.se.project.project.Model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Project
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Project {

    private Integer id;
    private String name;
    private String location;


    /* 
        Many to many relationship between Project and Employee class
        Getter and Setter methods of Set<Employee> class
    */

    private Set<Employee> employees;

   
    @ManyToMany(mappedBy = "projects")  
    public Set<Employee> getEmployees() {
        return employees;
    }


    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


    /* 
        Many to one Relationship between Project and Department class
        Getter and setter of Department class
         */
    private Department department;

    
    @ManyToOne
    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    /* 
        one to one relationShip between project and employee 
    */

    private Employee leader;

    @OneToOne
    public Employee getLeader() {
        return leader;
    }


    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    

    /* 
        Getter and Setter on all Attribute of Project class
         */
    @Id
    @GeneratedValue
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