package com.retailer.rewards.service;

import com.retailer.rewards.entity.Customer;
import com.retailer.rewards.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(Long customerId) {
        List<Customer> customers = new ArrayList<>();

        Optional<Customer> customer = customerRepository.findById(customerId);
        System.out.println("Customer=" + customer);
        return customer.get();
    }
}
