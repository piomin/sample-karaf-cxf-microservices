package pl.piomin.services.cxf.api;

import jakarta.ws.rs.*;
import pl.piomin.services.cxf.api.model.Customer;

import java.util.List;

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
