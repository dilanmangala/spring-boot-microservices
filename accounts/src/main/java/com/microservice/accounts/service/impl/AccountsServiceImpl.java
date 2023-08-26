package com.microservice.accounts.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micriservice.accounts.dto.AccountsDto;
import com.microservice.accounts.domain.Accounts;
import com.microservice.accounts.repository.AccountsRepository;
import com.microservice.accounts.service.AccountsService;

@Service
public class AccountsServiceImpl implements AccountsService{
	
	@Autowired
	private AccountsRepository accountRepository;

	@Override
	public List<AccountsDto> getAllAccounts() {
		List<AccountsDto> accountsDotList = new ArrayList<>();
		List<Accounts> accountsList = accountRepository.findAll();
		
		accountsList.forEach(source -> {
			AccountsDto accountDto = new AccountsDto();
			BeanUtils.copyProperties(source, accountDto);
			accountsDotList.add(accountDto);
		});
		
		return accountsDotList;
	}

	@Override
	public AccountsDto addAccount(AccountsDto accountDto) {
		Accounts accounts = new Accounts();
		BeanUtils.copyProperties(accountDto, accounts);
		accountRepository.save(accounts);
		return accountDto;
	}

	@Override
	public String updateAccount(AccountsDto accountDto) {
		Optional<Accounts> accounts = accountRepository.findById(accountDto.getId());
		if (accounts.isPresent()) {
			Accounts accountObj = accounts.get();
			accountObj.setAccountHolderAccNo(accountDto.getAccountHolderAccNo());
			accountObj.setAccountHolderName(accountDto.getAccountHolderName());
			accountObj.setAccountHolderAddress(accountDto.getAccountHolderAddress());
			accountObj.setAccountHolderTelNo(accountDto.getAccountHolderTelNo());
			accountRepository.save(accountObj);
			return "Updated Successfully For : "+ accountDto.getAccountHolderName();
		}else {
			return "No Record Found For : "+ accountDto.getAccountHolderName();
		}
		
	}
}
