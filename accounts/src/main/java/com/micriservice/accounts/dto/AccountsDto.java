package com.micriservice.accounts.dto;

public class AccountsDto {

	private long id;
	private String accountHolderName;
	private String accountHolderAddress;
	private String accountHolderTelNo;
	private String accountHolderAccNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}
	public String getAccountHolderTelNo() {
		return accountHolderTelNo;
	}
	public void setAccountHolderTelNo(String accountHolderTelNo) {
		this.accountHolderTelNo = accountHolderTelNo;
	}
	public String getAccountHolderAccNo() {
		return accountHolderAccNo;
	}
	public void setAccountHolderAccNo(String accountHolderAccNo) {
		this.accountHolderAccNo = accountHolderAccNo;
	}
	
	
}
