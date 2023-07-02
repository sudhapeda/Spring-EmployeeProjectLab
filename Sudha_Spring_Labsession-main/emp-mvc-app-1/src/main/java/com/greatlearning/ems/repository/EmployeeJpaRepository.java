package com.greatlearning.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.model.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

}
