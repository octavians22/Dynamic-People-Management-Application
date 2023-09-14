package com.example.CRUD_Angular_SpringBoot.repository;

import com.example.CRUD_Angular_SpringBoot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
