package com.example.rocket_elevators_java_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/interventions")
public class InterventionController {
    private InterventionService interventionService;
    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }
    // @Autowired //  tells Spring to inject the interventionRepository bean, which is implemented from the repository interface

    @GetMapping("")
    public List<Intervention> getAllInterventions(){
        return interventionService.listAllInterventions();
    }

        // @Autowired //  tells Spring to inject the customerRepository bean, which is implemented from the repository interface
        // private CustomerRepository customerRepository;

        // @PostMapping("/add") // POST requests for /add
        // public String addCustomer(@RequestParam String first, @RequestParam String last) {
        //  Customer customer = new Customer(); // @RequestParam = map the method parameters to the corresponding web request parameters.
        //  customer.setFirstName(first);
        //  customer.setLastName(last);
        //  customerRepository.save(customer);
        //   return "Added new customer to repo!";
        //   }

        // @GetMapping("/list") // maps the getCustomers() method to GET requests for /list
        // public Iterable<Customer> getCustomers() {
        //    return customerRepository.findAll();
        // }

        // @GetMapping("/find/{id}") // maps the findCustomerById() method to GET requests for /find/{id}
        // public Customer findCustomerById(@PathVariable Integer id) {
        //    return customerRepository.findCustomerById(id);
            // @PathVariable annotation maps the value in place of the id variable from the URL to the corresponding method parameter


}
