package com.jorge.openapigen.service;

import com.jorge.openapigen.CustomersApiDelegate;
import com.jorge.openapigen.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomersApiDelegate {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return CustomersApiDelegate.super.getRequest();
    }

    @Override
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        System.out.println("Customer created");
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Customer>> getAllCustomers() {
        System.out.println("Customer list");
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        List<Customer> list = new ArrayList<>();
        list.add(customer1);
        list.add(customer2);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> getCustomer(Long customerId) {
        System.out.println("Customer found");
        Customer customer = new Customer();
        customer.setId(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
