package pl.piomin.services.cxf.account.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.piomin.services.cxf.account.model.Account;

public interface AccountService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Account findById(@PathParam("id") Integer id);

	@GET
	@Path("/")
	@Produces("application/json")
	public List<Account> findAll();

	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	public Account add(Account account);

}
