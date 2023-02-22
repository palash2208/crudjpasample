package com.pal.sample.crudh2sample.service;

import com.pal.sample.crudh2sample.entity.Customer;
import com.pal.sample.crudh2sample.entity.Order;
import com.pal.sample.crudh2sample.repo.CustomerRepository;
import com.pal.sample.crudh2sample.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

}
