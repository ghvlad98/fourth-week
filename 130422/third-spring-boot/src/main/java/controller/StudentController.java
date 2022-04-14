package controller;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/student")
    ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping(path="/student")
    ResponseEntity<Student> create(@RequestBody Student student){
        Student student1 = studentService.create(student);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }
}
