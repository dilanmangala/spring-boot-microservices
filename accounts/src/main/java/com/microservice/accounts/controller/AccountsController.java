package com.microservice.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micriservice.accounts.dto.AccountsDto;
import com.microservice.accounts.service.AccountsService;

@RestController
@RequestMapping(value = "/accounts")
public class AccountsController {

	@Autowired
	private AccountsService accountsService;
	
	@GetMapping(value = "/get-all-accounts")
	public List<AccountsDto> getAllAccounts(){
		return accountsService.getAllAccounts();
	}
	
	@PostMapping(value = "/add-account")
	public AccountsDto addAccountDetails(@ RequestBody AccountsDto accountDto) {
		
		return accountsService.addAccount(accountDto);
	}
	
	@PostMapping(value = "/update-account")
	public String updateAccountDetails(@ RequestBody AccountsDto accountDto) {
		return accountsService.updateAccount(accountDto);
	}
}
