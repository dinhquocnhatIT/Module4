package com.qnhat.demo.repository;

import com.qnhat.demo.model.Customer;

import java.util.List;

public interface CustomerRepository extends Repository {
    @Override
    List<Customer> findAll();
}
