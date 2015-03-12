package com.cfour.ocean.core.services;

import com.cfour.ocean.core.entities.Account;
import com.cfour.ocean.core.utils.AccountList;

public interface AccountService {
	
	Account createAccount(Account data);
	Account findByUsername(String username);
	Account findAccountById(Long accountId);
	AccountList findAllAccounts();

}
