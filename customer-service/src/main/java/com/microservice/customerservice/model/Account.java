package com.microservice.customerservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer accountId;

	Double balance;

	Integer customerId;

	String accountType;

	String branchCode;

	String bank;

}
