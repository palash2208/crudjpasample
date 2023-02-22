package com.pal.sample.crudh2sample.repo;

import com.pal.sample.crudh2sample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
