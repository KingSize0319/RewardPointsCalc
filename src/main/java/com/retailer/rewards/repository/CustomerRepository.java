package com.retailer.rewards.repository;

import com.retailer.rewards.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
