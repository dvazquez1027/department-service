package com.davidvazquez.microservicesdemo.departmentservice.service;

import com.davidvazquez.microservicesdemo.departmentservice.dto.DepartmentDTO;
import com.davidvazquez.microservicesdemo.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.departmentRepository = repository;
    }

    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        log.info("Entering DepartmentService.saveDepartment");
        DepartmentDTO result = DepartmentDTO.fromEntity(departmentRepository.save(DepartmentDTO.toEntity(departmentDTO)));
        log.info("Exiting DepartmentService.saveDepartment");
        return result;
    }

    public DepartmentDTO findDepartmentById(Long departmentId) {
        log.info("Entering DepartmentService.findDepartmentById");
        DepartmentDTO result = DepartmentDTO.fromEntity(departmentRepository.findById(departmentId).get());
        log.info("Exiting DepartmentService.findDepartmentById");
        return result;
    }
}
