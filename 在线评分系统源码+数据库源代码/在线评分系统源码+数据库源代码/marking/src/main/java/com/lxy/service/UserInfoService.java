package com.lxy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.lxy.domain.Authority;
import com.lxy.domain.UserInfo;
import com.lxy.repository.AuthorityRepository;
import com.lxy.repository.UserInfoRepository;

import java.util.List;

/**
 * @Classname CustomerService
 * @Description 对用户数据结合Redis缓存进行业务处理
 * @Date 2019-3-5 15:58
 * @Created by CrazyStone
 */
@Service
public class UserInfoService {
   @Autowired
   private UserInfoRepository userInfoRepository;
   @Autowired
   private AuthorityRepository authorityRepository;
   @Autowired
   private RedisTemplate redisTemplate;
   //业务控制：使用唯一用户名查询用户信息
   public UserInfo getUserInfo(String name) {
	   UserInfo  userinfo=null;
		/*Object o= redisTemplate.opsForValue().get("userinfo_"+name);
		if(o!=null) {
		   userinfo=(UserInfo) o;
		}else {
		   userinfo = userInfoRepository.findByUsername(name);
		   if(userinfo!=null) {
			   redisTemplate.opsForValue().set("userinfo_"+name, userinfo);
			   
		   }
		}*/
	return userInfoRepository.findByUserName(name); 
   }
   //业务控制：使用唯一用户名查询用户权限
   public List<Authority> getUserInfoAuthority(String name){
	   List<Authority> authorities=null;
		/*Object o=redisTemplate.opsForValue().get("authorities_"+name);
		if(o!=null) {
		   authorities=(List<Authority>) o;
		}else {
		   authorities = authorityRepository.findAuthoritiesByUsername(name);
		   if(authorities!=null) {
			   redisTemplate.opsForValue().set("authorities_"+name, authorities);
			   
		   }
		}*/
	return authorityRepository.findAuthoritiesByUsername(name);
	   
   }
}

