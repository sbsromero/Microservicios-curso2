package com.microservice.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.customerservice.model.Customer;
import com.microservice.customerservice.repository.CustomerRepository;
import com.microservice.customerservice.service.AccountService;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AccountService accountService;

	@GetMapping(value = "/customer")
	public Iterable<Customer> all() {
		return customerRepository.findAll();
	}

	@PostMapping(value = "/customer")
	public Customer save(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@PutMapping(value = "/customer")
	public Customer update(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@DeleteMapping(value = "/customer")
	public void delete(@RequestBody Customer customer) {
		customerRepository.delete(customer);
	}

	// consume el feign
	@GetMapping(value = "/customer/{customerId}")
	public Customer findByAccountId(@PathVariable Integer customerId) {
		Customer customer = customerRepository.findByCustomerId(customerId);
		customer.setAccounts(accountService.findByCustomer(customerId));
		return customer;
	}
}
