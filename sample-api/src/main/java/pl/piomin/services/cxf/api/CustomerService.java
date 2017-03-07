package pl.piomin.services.cxf.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.piomin.services.cxf.api.model.Customer;

public interface CustomerService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Customer findById(@PathParam("id") Integer id);

	@GET
	@Path("/")
	@Produces("application/json")
	public List<Customer> findAll();

	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	public Customer add(Customer account);
	
}
