package pl.piomin.services.cxf.account.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.osgi.service.component.annotations.Component;

import pl.piomin.services.cxf.account.model.Account;

@Component(service = AccountService.class, property = { "service.exported.interfaces=*",
		"service.exported.configs=org.apache.cxf.rs", "org.apache.cxf.rs.address=/account" })
public class AccountService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Account findById(@PathParam("id") Integer id) {
		return new Account(id, "1234567890", 12345, 1);
	}

}
