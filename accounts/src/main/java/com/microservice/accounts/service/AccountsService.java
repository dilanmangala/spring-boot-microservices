package com.microservice.accounts.service;

import java.util.List;

import com.micriservice.accounts.dto.AccountsDto;

public interface AccountsService {

	List<AccountsDto> getAllAccounts();
	AccountsDto addAccount(AccountsDto accountDto);
	String updateAccount(AccountsDto accountDto);
	
}
