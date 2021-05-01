package cs.se.project.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.se.project.project.DTO.DepartmentDTO;
import cs.se.project.project.Model.Department;
import cs.se.project.project.repository.DepartmentRepository;

/**
 * DepatmentServiceImp
 */
@Service
public class DepatmentServiceImp implements DepartmentServices{


    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;
    


    @Override
    public Department addDepartment(Department department) {
        
        return departmentRepository.save(department);
    }

    @Override
    public Department getById(Integer id) {
       
        return departmentRepository.getOne(id);
    }

    @Override
    public List<Department> getAllDepartment() {
        
        return departmentRepository.findAll();
    }

    @Override
    public List<DepartmentDTO> convartToDTO(List<Department> departments) {
        List<DepartmentDTO> DepartmentDTOList = new ArrayList<>();

        for(Department department : departments){

            DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);
            departmentDTO.setProjectsIds(department.getProjects().stream().map(project->project.getId()).collect(Collectors.toList()));
            departmentDTO.setEmployeesIds(department.getEmployees().stream().map(employee -> employee.getId()).collect(Collectors.toList()));
            DepartmentDTOList.add(departmentDTO);
        }
        return DepartmentDTOList;
    }

    @Override
    public DepartmentDTO convartToDTO(Department addDepartment) {
        DepartmentDTO departmentDTO = modelMapper.map(addDepartment, DepartmentDTO.class);
        return departmentDTO;
    }
    



    
}