package com.lxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lxy.service.UserInfoService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkingApplicationTests {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private UserInfoService user;
	
	@Test
	public void contextLoads() {
		System.out.println(userInfoService.getUserInfoAuthority("李一"));
	}

}
