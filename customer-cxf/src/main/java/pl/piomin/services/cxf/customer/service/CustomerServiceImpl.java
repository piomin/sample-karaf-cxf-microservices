package pl.piomin.services.cxf.customer.service;

import java.util.ArrayList;
import java.util.List;

import pl.piomin.services.cxf.api.AccountService;
import pl.piomin.services.cxf.api.CustomerService;
import pl.piomin.services.cxf.api.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private AccountService accountService;

	private List<Customer> customers;

	public CustomerServiceImpl() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "XXX", "1234567890"));
		customers.add(new Customer(2, "YYY", "1234567891"));
		customers.add(new Customer(3, "ZZZ", "1234567892"));
	}

	@Override
	public Customer findById(Integer id) {
		Customer c = customers.stream().filter(a -> a.getId().equals(id)).findFirst().get();
		c.setAccounts(accountService.findAllByCustomerId(id));
		return c;
	}

	@Override
	public List<Customer> findAll() {
		return customers;
	}

	@Override
	public Customer add(Customer customer) {
		customers.add(customer);
		customer.setId(customers.size());
		return customer;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

}
