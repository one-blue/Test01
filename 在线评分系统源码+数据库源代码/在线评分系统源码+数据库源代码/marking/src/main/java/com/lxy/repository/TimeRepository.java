package com.lxy.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.Time;

public interface TimeRepository extends JpaRepository<Time, Integer> {
	@Transactional
	@Modifying
	@Query(value = "update t_time t  set t.product_name=?1 where t.id =?2", nativeQuery = true)
	public int updateTime(String name, int id);
}
