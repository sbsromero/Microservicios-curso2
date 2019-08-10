package com.microservice.customerservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.customerservice.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Customer findByCustomerId(Integer customerId);
}
