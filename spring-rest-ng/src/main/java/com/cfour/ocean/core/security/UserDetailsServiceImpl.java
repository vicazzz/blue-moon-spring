package com.cfour.ocean.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.cfour.ocean.core.entities.Account;
import com.cfour.ocean.core.services.AccountService;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AccountService accountService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Account account = accountService.findByUsername(username);

		if (account == null) {
			throw new UsernameNotFoundException("User with username: "
					+ username + " Not found");
		}

		return new AccountUserDetails(account);
	}

}
