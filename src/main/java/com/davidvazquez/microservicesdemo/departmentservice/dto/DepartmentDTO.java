package com.davidvazquez.microservicesdemo.departmentservice.dto;

import com.davidvazquez.microservicesdemo.departmentservice.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    public static Department toEntity(DepartmentDTO departmentDTO) {
        return new Department(departmentDTO.getId(), departmentDTO.getName(), departmentDTO.getAddress(), departmentDTO.getCity(), departmentDTO.getState(), departmentDTO.getZip());
    }

    public static DepartmentDTO fromEntity(Department department) {
        return new DepartmentDTO(department.getId(), department.getName(), department.getAddress(), department.getCity(), department.getCity(), department.getZip());
    }
}
