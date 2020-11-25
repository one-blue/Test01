package com.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.lxy.domain.Index;
import com.lxy.domain.Product;
import com.lxy.domain.UserInfo;
import com.lxy.service.IndexService;
import com.lxy.service.UserInfoService;
import com.lxy.service.UserService;
import com.lxy.service.productService;
import com.lxy.utils.GetUserName;


@Controller
public class IndexController {
	@Autowired
	IndexService indexservice;
	@Autowired
	productService productservice;
	@Autowired
	UserInfoService userInfoService;
	@Autowired
	UserService userService;
	
	@GetMapping("/index")
	public void IndexFindAll(Model model) {
		List<Index> indexlist = indexservice.findAll();
		List<Product> productlist = productservice.findAll();
		model.addAttribute("indexlist",indexlist);
		model.addAttribute("productlist",productlist);
		GetUserName getUserName = new GetUserName();
	    String userName = getUserName.getUserName();
	    UserInfo findByName = userService.findByName(userName);
	    String touImage = findByName.getTouImage();
	    model.addAttribute("img",touImage);
	}
	
	
	
}
