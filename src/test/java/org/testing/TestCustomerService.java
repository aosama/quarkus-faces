package org.testing;

import org.primefaces.showcase.service.CustomerService;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class TestCustomerService {
    
    @Inject
    CustomerService customerService;

    @Test
    public void testGetCustomers() {
        assert(customerService.getCustomers(10).size() == 10);
    }

    @Test
    public void testGetCountries() {
        assert(customerService.getCountries().size() > 1);
    }
        
}
