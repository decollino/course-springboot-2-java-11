package com.connectingtalents.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectingtalents.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
