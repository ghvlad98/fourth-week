package service;

import domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Student create(Student student);
    Optional<Student> findById(String id);
    void update();
}
