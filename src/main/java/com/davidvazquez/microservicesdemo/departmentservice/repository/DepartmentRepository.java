package com.davidvazquez.microservicesdemo.departmentservice.repository;

import com.davidvazquez.microservicesdemo.departmentservice.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
