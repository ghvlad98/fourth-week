package ex1.service;

import ex1.domain.Car;

import java.util.List;


public interface CarService {
    List<Car> findAll();
    Car create(Car car);
}
