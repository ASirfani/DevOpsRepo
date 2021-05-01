package cs.se.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.se.project.project.Model.Department;

/**
 * DepartmentRepository
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

    
}