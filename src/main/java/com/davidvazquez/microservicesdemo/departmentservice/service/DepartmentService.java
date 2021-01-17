package com.davidvazquez.microservicesdemo.departmentservice.service;

import com.davidvazquez.microservicesdemo.departmentservice.entity.Department;
import com.davidvazquez.microservicesdemo.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.departmentRepository = repository;
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}