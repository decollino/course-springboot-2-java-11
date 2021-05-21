package com.connectingtalents.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectingtalents.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
