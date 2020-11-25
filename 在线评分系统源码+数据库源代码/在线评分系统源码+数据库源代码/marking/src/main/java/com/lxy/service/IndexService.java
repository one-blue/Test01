package com.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lxy.domain.Index;
import com.lxy.repository.IndexRepository;
@Service
public class IndexService {
	
	@Autowired
	IndexRepository indexrepository;

 public List<Index> findAll() {
	 return indexrepository.findAll();
}
 
}
