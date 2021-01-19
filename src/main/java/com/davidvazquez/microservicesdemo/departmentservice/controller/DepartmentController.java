package com.davidvazquez.microservicesdemo.departmentservice.controller;

import com.davidvazquez.microservicesdemo.departmentservice.dto.DepartmentDTO;
import com.davidvazquez.microservicesdemo.departmentservice.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public DepartmentDTO createDepartment(@RequestBody DepartmentDTO departmentDTO) {
        return service.saveDepartment(departmentDTO);
    }

    @GetMapping("/{id}")
    public DepartmentDTO readDepartment(@PathVariable("id") Long departmentId) {
        return service.findDepartmentById(departmentId);
    }
}
