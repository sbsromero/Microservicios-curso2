package com.microservice.accountservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "ACCOUNTS	")
@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ACCOUNTID")
	Integer accountId;

	@Column(name = "BALANCE")
	Double balance;

	@Column(name = "CUSTOMERID")
	Integer customerId;

	@Column(name = "ACCOUNTTYPE")
	String accountType;

	@Column(name = "BRANCHCODE")
	String branchCode;

	@Column(name = "BANK")
	String bank;

}
