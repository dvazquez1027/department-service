package com.davidvazquez.microservicesdemo.departmentservice.service;

import com.davidvazquez.microservicesdemo.departmentservice.dto.DepartmentDTO;
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

    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        return DepartmentDTO.fromEntity(departmentRepository.save(DepartmentDTO.toEntity(departmentDTO)));
    }

    public DepartmentDTO findDepartmentById(Long departmentId) {
        return DepartmentDTO.fromEntity(departmentRepository.findById(departmentId).get());
    }
}
