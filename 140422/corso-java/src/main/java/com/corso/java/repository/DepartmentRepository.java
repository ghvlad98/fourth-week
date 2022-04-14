package com.corso.java.repository;

import com.corso.java.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DepartmentRepository extends JpaRepository<Department, String> {
}
