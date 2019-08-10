package com.microservice.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.accountservice.model.Account;
import com.microservice.accountservice.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	public AccountRepository accountRepository;

	@GetMapping(value = "/account")
	public Iterable<Account> all() {
		return accountRepository.findAll();
	}

	@PostMapping(value = "/account")
	public Account save(@RequestBody Account account) {
		return accountRepository.save(account);
	}

	@PutMapping(value = "/account")
	public Account update(@RequestBody Account account) {
		return accountRepository.save(account);
	}

	@DeleteMapping(value = "/account")
	public void delet(@RequestBody Account account) {
		accountRepository.delete(account);
	}

	@GetMapping(value = "/account/{accountId}")
	public Account findByAccountId(@PathVariable Integer accountId) {
		return accountRepository.findAccountByAccountId(accountId);
	}

	@GetMapping(value = "/account/account-type/{type}")
	public List<Account> findByAccountType(@PathVariable String type) {
		return accountRepository.findAllByAccountType(type);
	}

	@GetMapping(value = "/account/bank/{bank}")
	public List<Account> findByBank(@PathVariable String bank) {
		return accountRepository.findByBank(bank);
	}

	@GetMapping(value = "/account/customer/{customerId}")
	public List<Account> findByCustomer(@PathVariable Integer customerId) {
		return accountRepository.findAllByCustomerId(customerId);
	}
}
