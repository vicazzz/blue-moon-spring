package com.cfour.ocean.rest.resources.asm;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.cfour.ocean.core.entities.Account;
import com.cfour.ocean.rest.mvc.AccountController;
import com.cfour.ocean.rest.resources.AccountResource;

public class AccountResourceAsm extends
		ResourceAssemblerSupport<Account, AccountResource> {

	public AccountResourceAsm() {
		super(AccountController.class, AccountResource.class);

	}

	@Override
	public AccountResource toResource(Account account) {
		AccountResource res = new AccountResource();
		res.setName(account.getName());
		res.setPassword(account.getPassword());
		res.setRid(account.getId());
		res.add(linkTo(
				methodOn(AccountController.class).getAccount(account.getId()))
				.withSelfRel());
		return res;
	}

}
