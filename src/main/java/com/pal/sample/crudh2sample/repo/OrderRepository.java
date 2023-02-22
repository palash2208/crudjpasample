package com.pal.sample.crudh2sample.repo;

import com.pal.sample.crudh2sample.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
