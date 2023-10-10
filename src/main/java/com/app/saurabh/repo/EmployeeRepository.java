package com.app.saurabh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.saurabh.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
