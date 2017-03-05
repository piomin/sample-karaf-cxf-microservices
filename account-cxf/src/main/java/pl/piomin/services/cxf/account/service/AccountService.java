package pl.piomin.services.cxf.account.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.piomin.services.cxf.account.model.Account;

public class AccountService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Account findById(@PathParam("id") Integer id) {
		return new Account(id, "1234567890", 12345, 1);
	}
	
}
