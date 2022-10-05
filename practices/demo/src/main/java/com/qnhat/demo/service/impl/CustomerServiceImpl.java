package com.qnhat.demo.service.impl;

import com.qnhat.demo.model.Customer;
import com.qnhat.demo.repository.CustomerRepository;
import com.qnhat.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
