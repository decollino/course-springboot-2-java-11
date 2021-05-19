package com.connectingtalents.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectingtalents.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
