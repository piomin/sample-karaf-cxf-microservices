package pl.piomin.services.cxf.account.service;

import java.util.ArrayList;
import java.util.List;

import pl.piomin.services.cxf.account.model.Account;

public class AccountServiceImpl implements AccountService {

	private List<Account> accounts;
	
	public AccountServiceImpl() {
		accounts = new ArrayList<>(); 
		accounts.add(new Account(1, "1234567890", 12345, 1));
		accounts.add(new Account(2, "1234567891", 6543, 2));
		accounts.add(new Account(3, "1234567892", 45646, 3));
	}
	
	public Account findById(Integer id) {
		return accounts.stream().filter(a -> a.getId().equals(id)).findFirst().get();
	}

	public List<Account> findAll() {
		return accounts;
	}
	
	public Account add(Account account) {
		accounts.add(account);
		account.setId(accounts.size());
		return account;
	}
	
}
