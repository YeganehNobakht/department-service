package com.dailycodebuffer.departmentservice.controller;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping( "/")
    public Department saveDepartment(@RequestBody Department department){
        log.info(("inside saveDepartment method in controllert"));
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{departmentId}")
    public Department saveDepartment(@PathVariable Long departmentId){
        log.info(("inside saveDepartment method in controllert"));
        return departmentService.findDepartmentById(departmentId);
    }
}
