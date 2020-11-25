package com.lxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.UserInfo;

/**
 * Created by crazyStone on 2018-11-06.
 */

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
	/*@Query(value = "select a.user_name,a.password from t_user a where a.user_name=?1",nativeQuery = true)
		UserInfo findByUsername(String name);*/
	//部分字段要用map
	
	UserInfo findByUserName(String name);
	

}
