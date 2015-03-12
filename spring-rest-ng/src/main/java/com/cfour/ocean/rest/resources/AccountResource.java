package com.cfour.ocean.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import com.cfour.ocean.core.entities.Account;

public class AccountResource extends ResourceSupport {

	private Long rid;
	private String name;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Account toAccount() {
		Account account = new Account();
		account.setEmail(email);
		account.setName(name);
		account.setPassword(password);
		return account;

	}

	

}
