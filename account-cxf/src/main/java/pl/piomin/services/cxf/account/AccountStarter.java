package pl.piomin.services.cxf.account;

import java.io.IOException;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

import pl.piomin.services.cxf.account.service.AccountService;

public class AccountStarter {

    public void startRestService() {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:8282/account");
        factory.setResourceClasses(AccountService.class);
        factory.setResourceProvider(new SingletonResourceProvider(new AccountService()));
        factory.setProvider(new JacksonJaxbJsonProvider());
        Server server = factory.create();
        server.start();
    }
    
    public static void main(String[] args) throws IOException {
        new AccountStarter().startRestService();
        System.in.read();
    }

}
