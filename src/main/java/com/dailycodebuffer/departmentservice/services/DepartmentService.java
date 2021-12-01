package com.dailycodebuffer.departmentservice.services;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService{
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
        log.info(("inside saveDepartment method in Service"));
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info(("inside saveDepartment method in Service"));
        Department byDepartmentId = departmentRepository.findByDepartmentId(departmentId);
        return byDepartmentId;
    }

}
