
package com.lxy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lxy.domain.UserInfo;
import com.lxy.repository.UserInfoRepository;

@Service
public class UserService {
@Autowired
UserInfoRepository userinforepository;
//查询用户信息

public List<UserInfo> findAll() {
	return userinforepository.findAll();
}
	

public 	Optional<UserInfo> findUserInfoById(int id) {
	return userinforepository.findById(id);
}


public UserInfo findByName(String userName) {
	return userinforepository.findByUserName(userName);
	// TODO Auto-generated method stub
	
}


public void save(UserInfo user) {
	// TODO Auto-generated method stub
	userinforepository.save(user);
}
}
