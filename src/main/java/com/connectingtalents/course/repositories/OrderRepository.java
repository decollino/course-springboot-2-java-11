package com.connectingtalents.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectingtalents.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
