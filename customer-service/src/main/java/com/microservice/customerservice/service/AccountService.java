package com.microservice.customerservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.customerservice.model.Account;

@FeignClient(name = "account-service")
public interface AccountService {

	@GetMapping(value = "/account/customer/{customerId}")
	List<Account> findByCustomer(@PathVariable("customerId") Integer customerId);
}
