package com.lease_api.car.controller;

import com.lease_api.car.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

  private List<Car> cars = new ArrayList<>();


  @GetMapping
  public List<Car> getCars() {
    return cars;
  }

  @PostMapping
  public String addCar(@RequestBody Car car) {
    cars.add(car);
    return "Car added!";
  }
}
