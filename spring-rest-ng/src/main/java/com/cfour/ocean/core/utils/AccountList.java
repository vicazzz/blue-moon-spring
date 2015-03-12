package com.cfour.ocean.core.utils;

import java.util.ArrayList;
import java.util.List;

import com.cfour.ocean.core.entities.Account;

public class AccountList {
	
	private List<Account> accounts = new ArrayList<Account>();
	
	public AccountList(){
		
	}
	
	public AccountList(List<Account> accounts){
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	

}
