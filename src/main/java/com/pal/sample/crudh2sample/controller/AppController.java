package com.pal.sample.crudh2sample.controller;

import com.pal.sample.crudh2sample.entity.Customer;
import com.pal.sample.crudh2sample.entity.Order;
import com.pal.sample.crudh2sample.entity.Product;
import com.pal.sample.crudh2sample.service.AppService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping("/insertDummy")
    public ResponseEntity<String> insertDummy() {

        // Customer start
        Customer customer = new Customer();
        customer.setName("Pal");
        customer.setTier(1);

        Customer customer2 = new Customer();
        customer2.setName("Customer2");
        customer2.setTier(2);
        // Customer end

        // Product start
        Product product = new Product();
        product.setName("P1");
        product.setCategory("C1");
        product.setPrice(10.00);

        Product product2 = new Product();
        product2.setName("P2");
        product2.setCategory("C2");
        product2.setPrice(20.00);

        Product product3 = new Product();
        product3.setName("P3");
        product3.setCategory("C1");
        product3.setPrice(30.00);
        // Product ends

        Order o = new Order();
        o.setCustomer(customer2);
        o.setStatus("OPEN");
        o.setOrderDate(LocalDate.now());
        o.setDeliveryDate(LocalDate.now());
        o.setProducts(List.of(product2, product3));

        service.saveCustomer(customer2);

        service.saveOrder(o);

        return new ResponseEntity<>("Dummy data is created", HttpStatus.CREATED);
    }

}
