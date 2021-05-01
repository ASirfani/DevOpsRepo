package cs.se.project.project.services;

import java.util.List;

import cs.se.project.project.DTO.EmployeeDTO;
import cs.se.project.project.Model.Employee;

/**
 * EmployeeServices
 */
public interface EmployeeServices{

    

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee addEmployee(Employee employee);

    void deleteEmployee(Integer id);

    List<EmployeeDTO> convartToDTO(List<Employee> employees);

    Employee convartToDTO(Employee employee);

    
   

    
}