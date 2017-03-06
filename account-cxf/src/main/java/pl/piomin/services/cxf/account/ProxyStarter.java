package pl.piomin.services.cxf.account;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import pl.piomin.services.cxf.account.service.AccountService;

public class ProxyStarter {

	public static void main(String[] args) {
		List providers = new ArrayList<>();
		providers.add(new JacksonJsonProvider());
		AccountService proxy = JAXRSClientFactory.create("http://localhost:8282/account", AccountService.class, providers);
		WebClient.client(proxy).accept("application/json");
		proxy.findById(1);
	}

}
