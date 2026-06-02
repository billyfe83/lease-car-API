package com.lease_api.car.controller;

import com.lease_api.car.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private List<Customer> customers = new ArrayList<>();


  @GetMapping
  public List<Customer> getCustomers() {
    return customers;
  }


  @PostMapping
  public String addCustomer(@RequestBody Customer customer) {
    customers.add(customer);
    return "Customer added";
  }

  @DeleteMapping("/{id}")
  public String deleteCustomer(@PathVariable Long id) {
    customers.removeIf(customer ->
      customer.getId().equals(id));
    return "customer deleted!";
  }

}
