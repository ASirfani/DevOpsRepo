package cs.se.project.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cs.se.project.project.Model.Department;
import cs.se.project.project.services.DepartmentServices;

/**
 * DepartmentController
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServices departmentservices;
    
    @PostMapping("/department/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){

        Department addDepartment = departmentservices.addDepartment(department);
        return new ResponseEntity<>(addDepartment,HttpStatus.CREATED);

    }


    @GetMapping("/department/all")
    public ResponseEntity<List<Department>> getAllDepartment(){

        List<Department> departments = departmentservices.getAllDepartment();
        return new ResponseEntity<>(departments,HttpStatus.OK);

    }



    
}