package com.lxy.repository;


import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.Product;
@Transactional
//查询产品名称，和产品介绍
public interface productRepository extends JpaRepository<Product, Integer>{
	@Transactional
	@Modifying
	@Query(value = "update t_product t  set t.product_name=?1 where t.id =?2", nativeQuery = true)
	public int updateproduct(String name, int id);

	
}
