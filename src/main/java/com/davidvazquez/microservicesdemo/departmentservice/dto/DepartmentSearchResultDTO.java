package com.davidvazquez.microservicesdemo.departmentservice.dto;

import com.davidvazquez.microservicesdemo.departmentservice.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentSearchResultDTO {
    private Long id;
    private String name;

    public static DepartmentSearchResultDTO fromEntity(Department department) {
        return new DepartmentSearchResultDTO(department.getId(), department.getName());
    }
}
