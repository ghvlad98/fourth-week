package ex1.controller;


import ex1.domain.Car;
import ex1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(path = "/car")
    ResponseEntity<List<Car>> getAll(){
        List<Car> car = carService.findAll();
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PostMapping(path="/car")
    ResponseEntity<Car> create(@RequestBody Car car){
        Car car1 = carService.create(car);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }
}
