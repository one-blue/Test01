package com.lxy.repository;



import java.util.List;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.Score;

@Transactional
public interface ScoreRepository extends JpaRepository<Score, Integer>{


	@Transactional
	@Modifying
	@Query(value = "update t_score t  set t.product_name=?1 where t.id =?2", nativeQuery = true)
	public int updatescore(String name, int id2);
	@Query(value = "select * from t_score t where t.user_name=?1 ", nativeQuery = true)
	public List<Score> findByName(String userName);
	





	


}
