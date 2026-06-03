package com.lease_api.car.controller;

import com.lease_api.car.model.LeaseRequest;
import com.lease_api.car.service.LeaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lease")
public class LeaseController {

  // import lease service and generate constructor
  private LeaseService leaseService;

  public LeaseController(LeaseService leaseService) {
    this.leaseService = leaseService;
  }

 // making url
  @PostMapping("/calculate")
  public double calculateLease(@RequestBody LeaseRequest request) {

    return leaseService.calculateLeaseRate(
      request.getMileage(),
      request.getDuration(),
      request.getInterestRate(),
      request.getNettPrice()

    );
  }
}
