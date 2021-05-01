package cs.se.project.project.services;

import java.util.List;

import cs.se.project.project.DTO.DepartmentDTO;
import cs.se.project.project.Model.Department;

/**
 * DepartmentServices
 */
public interface DepartmentServices {

    Department addDepartment(Department department);

    Department getById(Integer id);

    List<Department> getAllDepartment();

    List<DepartmentDTO> convartToDTO(List<Department> departments);

    DepartmentDTO convartToDTO(Department addDepartment);

    

    
}