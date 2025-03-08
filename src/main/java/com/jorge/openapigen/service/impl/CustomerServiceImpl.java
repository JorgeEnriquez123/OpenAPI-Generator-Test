package com.jorge.openapigen.service.impl;

import com.jorge.client.api.CustomersApi;
import com.jorge.client.model.Customer;
import com.jorge.openapigen.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    // This is the generated API client
    // This makes a call to the documented API endpoints (which already contains the logic)
    private final CustomersApi customersApi;

    @Override
    public Mono<Customer> getCustomer(Long customerId) {
        return customersApi.getCustomer(customerId);
    }

    @Override
    public Flux<Customer> getAllCustomers() {
        return customersApi.getAllCustomers();
    }

    @Override
    public Mono<Customer> createCustomer(Customer customer) {
        return customersApi.createCustomer(customer);
    }
}
