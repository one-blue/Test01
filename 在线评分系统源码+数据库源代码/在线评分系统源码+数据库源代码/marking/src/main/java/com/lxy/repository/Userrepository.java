
package com.lxy.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lxy.domain.UserInfo;
@Transactional
public interface Userrepository extends JpaRepository<UserInfo, Integer>{
	
public 	UserInfo findById(int id);
@Query(value="select * from t_user t where user_name=?1",nativeQuery = true)
public UserInfo findByName(String s);

}
