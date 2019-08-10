package com.microservice.accountservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservice.accountservice.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	List<Account> findAllByCustomerId(Integer customerId);

	List<Account> findAllByAccountType(String accountType);

	List<Account> findByBank(String bank);

	Account findAccountByAccountId(Integer accountId);
}
