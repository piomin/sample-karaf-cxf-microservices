package pl.piomin.services.cxf.account;

import java.io.IOException;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import pl.piomin.services.cxf.account.service.AccountServiceImpl;

public class AccountStarter {

    public void startRestService() {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:8282/account");
        factory.setResourceClasses(AccountServiceImpl.class);
        factory.setProvider(new JacksonJsonProvider());
        Server server = factory.create();
        server.start();
    }
    
    public static void main(String[] args) throws IOException {
        new AccountStarter().startRestService();
        System.in.read();
    }

}
