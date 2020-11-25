package com.lxy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lxy.domain.Product;
import com.lxy.repository.productRepository;
@Service
public class productService {
	
	@Autowired
	productRepository productrepository;

 public List<Product> findAll() {
	 return productrepository.findAll();
}
	public Optional<Product>  findById(int id) {
		// TODO Auto-generated method stub
		return productrepository.findById(id);
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		productrepository.deleteById(id);
	}
	public int updateproduct(String name, int id) {
		// TODO Auto-generated method stub
		 return productrepository.updateproduct(name,id);
	}
 
}
