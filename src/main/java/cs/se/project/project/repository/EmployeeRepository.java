package cs.se.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.se.project.project.Model.Employee;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{



    

}