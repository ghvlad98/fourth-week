package com.corso.java.service;

import com.corso.java.domain.Department;
import com.corso.java.domain.Student;
import com.corso.java.repository.DepartmentRepository;
import com.corso.java.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Optional<Department> findByIdDep(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
