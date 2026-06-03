package com.lease_api.car.service;

import org.springframework.stereotype.Service;

@Service
public class LeaseService {

  // Calculate the lease rate

  public double calculateLeaseRate(double mileage, int duration,
                                   double interestRate, double nettPrice) {

    return (((mileage / 12) * duration) / nettPrice)
      + (((interestRate / 100) * nettPrice) / 12);
  }
}
