package cs.se.project.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.se.project.project.DTO.EmployeeDTO;
import cs.se.project.project.Model.Employee;
import cs.se.project.project.repository.EmployeeRepository;

/**s
 * EmployeeServiceImp
 */
@Service
public class EmployeeServiceImp implements EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        
    }

    @Override
    public List<EmployeeDTO> convartToDTO(List<Employee> employees) {
       List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        for(Employee employee:employees){
            EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
            employeeDTO.setProjectsIds(employee.getProjects().stream().map(project -> project.getId()).collect(Collectors.toList()));
        
            employeeDTOList.add(employeeDTO);
   
         }
        return employeeDTOList;
    }

    @Override
    public Employee convartToDTO(Employee employee) {
    
        return null;
    }


    
    
}