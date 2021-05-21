package com.connectingtalents.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectingtalents.course.entities.Product;
import com.connectingtalents.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
