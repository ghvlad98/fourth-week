package com.corso.java.controller;

import com.corso.java.domain.Department;
import com.corso.java.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/api/v2")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(path="/{id}")
    ResponseEntity<Department> findByIdDep(@PathVariable String id) {
        Optional<Department> department = departmentService.findByIdDep(id);
        return new ResponseEntity<Department>(departmentService.findByIdDep(id).get(), HttpStatus.OK);
    }

    @GetMapping(path="/")
    ResponseEntity<List<Department>> findAll() {
        return new ResponseEntity<>(departmentService.findAll(), HttpStatus.OK);
    }
}
