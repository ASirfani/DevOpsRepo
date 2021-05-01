package cs.se.project.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cs.se.project.project.DTO.EmployeeDTO;
import cs.se.project.project.Model.Employee;
import cs.se.project.project.services.EmployeeServices;

/**
 * EmployeeController
 */

 @RestController
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;


   
   @GetMapping("/employee/all")
   public ResponseEntity<List<EmployeeDTO>> getEmployees(){

      List<Employee> employees = employeeServices.getAllEmployees();
      List<EmployeeDTO> employeeDTOList =  employeeServices.convartToDTO(employees);
      return new ResponseEntity<>(employeeDTOList, HttpStatus.OK);
   }

   @PostMapping("/employee/add")
   public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
      Employee saveEmployee = employeeServices.addEmployee(employee);
      return new ResponseEntity<>(saveEmployee , HttpStatus.CREATED) ;
   }

   @GetMapping("/employee/{id}")
   public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
      Employee employee = employeeServices.getEmployeeById(id);
      return new ResponseEntity<>(employee , HttpStatus.OK);
   }


   @PutMapping("/employee/update")
   public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
      Employee saveEmployee = employeeServices.addEmployee(employee);
      return new ResponseEntity<>(saveEmployee , HttpStatus.OK) ;
   }


   @DeleteMapping("/employee/{id}/delete")
   public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id){

      employeeServices.deleteEmployee(id);

      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }





}
