package com.lease_api.car.model;

public class LeaseRequest {

  // Declarer fields
   private double mileage;
   private int duration;
   private double interestRate;
   private double nettPrice;

   // GETTER and SETTER

  public double getMileage() {
    return mileage;
  }

  public void setMileage(double mileage) {
    this.mileage = mileage;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getNettPrice() {
    return nettPrice;
  }

  public void setNettPrice(double nettPrice) {
    this.nettPrice = nettPrice;
  }
}
