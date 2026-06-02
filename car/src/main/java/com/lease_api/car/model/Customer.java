package com.lease_api.car.model;

public class Customer {
  // Set fields

  private Long id;
  private String name;
  private String street;
  private String houseNumber;
  private String zipcode;
  private String place;
  private String email;
  private String phoneNumber;

  //Constructor

  public Customer() {
  }

  public Customer(Long id, String name, String houseNumber,
                  String street, String zipcode, String place, String email, String phoneNumber) {
    this.id = id;
    this.name = name;
    this.houseNumber = houseNumber;
    this.street = street;
    this.zipcode = zipcode;
    this.place = place;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  // GETTER and SETTER

  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
