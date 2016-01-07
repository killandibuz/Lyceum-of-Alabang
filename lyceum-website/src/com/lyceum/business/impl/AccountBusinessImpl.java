package com.lyceum.business.impl;

import com.lyceum.business.AccountBusiness;
import com.lyceum.dao.AccountRepository;
import com.lyceum.model.Account;

public class AccountBusinessImpl implements AccountBusiness{

	private AccountRepository accountRepository;
	
	public void setAccountRepository(AccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	
	@Override
	public String loginAccount(Account account) {
		// TODO Auto-generated method stub
		try{
			
			if (account.getStrUsername() == null || account.getStrUsername().equals("")){
				throw new IllegalArgumentException();
			}
			if (account.getStrPassword() == null || account.getStrPassword().equals("")){
				throw new IllegalArgumentException();
			}
			return accountRepository.loginAccount(account);
			
		}catch(IllegalArgumentException exception){
			exception.printStackTrace();
		}
		return "errorInValidation";
	}

	
	
}