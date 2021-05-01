package cs.se.project.project.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Employee
 */

 @Entity
 @Table(name = "Employees")
 @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Employee {
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private Double salary;
    

    /* 
        Many to many Relationship between Employee and project class
        Getter and Setter method of ser<Porject> class
        */

    private Set<Project> projects;

    @ManyToMany
    @JoinTable(name = "Prjects_Employee", joinColumns = @JoinColumn(name = "Employee_id"),inverseJoinColumns = @JoinColumn(name="Porject_id"))
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    

    

    /* 
        One to One Relationship between Employee and Department class
        Getter and Setter method of Department class
        */
    private Department managingDepartment;

   @OneToOne(mappedBy = "manager")
    public Department getDepartment() {
        return managingDepartment;
    }

    public void setDepartment(Department department) {
        this.managingDepartment = department;
    }


    /* 
        Many to one relationship between 
    */

    private Department workingDepartment;
    
    @ManyToOne
    @JsonBackReference
    public Department getWorkingDepartment() {
        return workingDepartment;
    }

    public void setWorkingDepartment(Department workingDepartment) {
        this.workingDepartment = workingDepartment;
    }


    /* 
        Ont to one relationship between employee and project 
        
    */

    private Project leadingProject;
    
    @OneToOne(mappedBy = "leader")
    public Project getLeadingProject() {
        return leadingProject;
    }

    public void setLeadingProject(Project leadingProject) {
        this.leadingProject = leadingProject;
    }




    /* 
        Getter and Setter method of Employee class 
        
        */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
   
    }


 














    /* Constructor methods */

    public Employee(Integer id, String firstName, String lastName, String gender, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }


    public Employee(){



    
    }

   



  
}