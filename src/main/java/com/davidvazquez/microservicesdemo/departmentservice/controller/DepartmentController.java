package com.davidvazquez.microservicesdemo.departmentservice.controller;

import com.davidvazquez.microservicesdemo.departmentservice.dto.DepartmentDTO;
import com.davidvazquez.microservicesdemo.departmentservice.dto.DepartmentSearchResultsDTO;
import com.davidvazquez.microservicesdemo.departmentservice.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public DepartmentDTO createDepartment(@RequestBody DepartmentDTO departmentDTO) {
        log.info("Entering DepartmentController::createDepartment");
        DepartmentDTO result = service.saveDepartment(departmentDTO);
        log.info("Exiting DepartmentController::createDepartment");
        return result;
    }

    @GetMapping
    public DepartmentSearchResultsDTO searchForDepartments(@RequestParam("name") String name) {
        log.info("Entering DepartmentController.searchForDepartments");
        DepartmentSearchResultsDTO results = service.findDepartmentsByName(name);
        log.info("Exiting DepartmentController.searchForDepartments");
        return results;
    }

    @GetMapping("/{id}")
    public DepartmentDTO readDepartment(@PathVariable("id") Long departmentId) {
        log.info("Entering DepartmentController.readDepartment");
        DepartmentDTO result = service.findDepartmentById(departmentId);
        log.info("Exiting DepartmentController.readDepartment");
        return result;
    }
}
