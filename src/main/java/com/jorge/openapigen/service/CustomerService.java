package com.jorge.openapigen.service;

import com.jorge.client.model.Customer;
import com.jorge.openapigen.feign.CustomerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerClient customerClient;

    public ResponseEntity<List<Customer>> getAllCustomers() {
        return customerClient.getAllCustomers();
    }

    public ResponseEntity<Customer> getCustomerById(Long id) {
        return customerClient.getCustomer(id);
    }

    public ResponseEntity<Customer> createCustomer(Customer customer) {
        return customerClient.createCustomer(customer);
    }
}
