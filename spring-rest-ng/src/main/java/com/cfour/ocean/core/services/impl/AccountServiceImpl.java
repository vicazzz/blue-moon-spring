package com.cfour.ocean.core.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cfour.ocean.core.entities.Account;
import com.cfour.ocean.core.exceptions.AccountDoesNotExistException;
import com.cfour.ocean.core.services.AccountService;
import com.cfour.ocean.core.utils.AccountList;

@Service
public class AccountServiceImpl implements AccountService {

	private Map<String, List<Account>> accounts = new HashMap<String, List<Account>>();

	@Override
	public Account createAccount(Account data) {

		if (accounts.get(data.getEmail()) != null) {
			List<Account> acc = accounts.get(data.getEmail());
			acc.add(data);
		} else {
			List<Account> acc = new ArrayList<Account>();
			acc.add(data);
			accounts.put(data.getEmail(), acc);
		}

		return data;
	}

	@Override
	public Account findByUsername(String username) {
		List<Account> acc = accounts.get(username);
		if (acc != null && acc.size() > 0) {
			return acc.get(0);
		}

		throw new AccountDoesNotExistException();
	}

	@Override
	public Account findAccountById(Long accountId) {
		Account account = new Account();
		account.setId(accountId);

		return account;
	}

	@Override
	public AccountList findAllAccounts() {
		AccountList accList = new AccountList();
		accList.setAccounts((ArrayList) accounts.values());
		return accList;
	}

}
