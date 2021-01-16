package com.davidvazquez.department.departmentservice.repository;

import com.davidvazquez.department.departmentservice.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
