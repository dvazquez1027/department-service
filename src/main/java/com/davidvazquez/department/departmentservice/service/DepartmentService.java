package com.davidvazquez.department.departmentservice.service;

import com.davidvazquez.department.departmentservice.entity.Department;
import com.davidvazquez.department.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository repository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public Department findDepartmentById(Long id) {
        return repository.findById(id).get();
    }
}
