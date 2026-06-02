package com.lease_api.car.model;

public class Car {

  // Declarer field
  private long id;
  private String make;
  private String model;
  private String version;
  private int numberOfDoors;
  private String co2Emission;
  private double grossPrice;
  private double nettPrice;



// Constructor
  public Car() {

  }


  // GETTER for ID


  public long getId() {
    return id;
  }

}
