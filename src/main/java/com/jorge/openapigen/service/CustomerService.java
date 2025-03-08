package com.jorge.openapigen.service;

import com.jorge.client.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// Contract from the generated API client
public interface CustomerService {
    Mono<Customer> getCustomer(Long customerId);
    Flux<Customer> getAllCustomers();
    Mono<Customer> createCustomer(Customer customer);
}
