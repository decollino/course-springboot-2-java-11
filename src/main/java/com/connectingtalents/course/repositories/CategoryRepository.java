package com.connectingtalents.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectingtalents.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
