package com.lxy.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxy.domain.Product;
import com.lxy.domain.Score;
import com.lxy.domain.Time;
import com.lxy.repository.productRepository;
import com.lxy.service.ScoreService;
import com.lxy.service.TimeService;
import com.lxy.service.productService;

@Controller
public class AdminController {

	@Autowired
	private ScoreService scoreservice;
	@Autowired
	private	productRepository productrepository;
	@Autowired
	private	productService productservice;
	@Autowired
	private TimeService timeservice;
	@GetMapping("/delete/{id}")
	@ResponseBody
	public int delete(@PathVariable int id ) {
		//根据id删除分数表中对应的信息
	     scoreservice.deleteById(id);
		System.out.println("删除分数表中的信息成功！！");
		return 1;
	}
	
	@GetMapping("/del/{id}")
	@ResponseBody
	public int del(@PathVariable int id) {
		Optional<Product> productId = productservice.findById(id);
		List<Score> scoreAll = scoreservice.findAll();
		for(Score s:scoreAll) {
			if(s.getProductName().equals(productId.get().getProductName())) {
				int ids = s.getId();
				//删除score表中信息
				scoreservice.deleteById(ids);
				
			}
			
		}
		List<Time> timefindAll = timeservice.findAll();
		for(Time t:timefindAll) {
			if(t.getProductName().equals(productId.get().getProductName())) {
				int idt = t.getId();
				timeservice.deleteById(idt);
			}	
		}
		//删除product表中的信息
		productservice.deleteById(id);
		return 1;
	}
	
	

	
	//修改产品名称
	@GetMapping("/update")
	public String update(Model model,@RequestParam("name") String name,
			@RequestParam("id") int id
			) {
		Optional<Product> productfindById = productservice.findById(id);
		String productName = productfindById.get().getProductName();
		List<Time> timefindAll = timeservice.findAll();
		for(Time t:timefindAll) {
			if(t.getProductName().equals(productName)) {
				int idt = t.getId();
				//修改time表里的名称
			 timeservice.updateTime(name,  idt);	
			}
		}
		List<Score> scorefindAll = scoreservice.findAll();
		for(Score s:scorefindAll){
			if(s.getProductName().equals(productName)) {
				int id2 = s.getId();
				//修改分数表name
				scoreservice.updatescore(name,id2);
			}
		}
		productservice.updateproduct(name,id);
		return "redirect:/select";
	}
		
	//添加产品到time表和product表 /{pName}/{productIntroduce}/{start}/{end}
	@GetMapping("/add")
	public String add(
			@RequestParam("productName")  String pName,
			@RequestParam("productIntroduce")  String productIntroduce,
			@RequestParam("start")  String start,
			@RequestParam("end")  String end) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date startdate = sf.parse(start);
		Date enddate = sf.parse(end);
		Time t=new Time();
		t.setProductName(pName);
		t.setStartTime(startdate);
		t.setEndTime(enddate);
		timeservice.save(t);
		Product p=new Product();
		p.setGrade("0");
		p.setProductIntroduce(productIntroduce);
		p.setProductName(pName);
		productrepository.save(p);
		
		 return "redirect:/admin";		
	}
	
	
	@GetMapping("/select")
	public String select(Model model) {
		List<Product> productAll = productservice.findAll();
		model.addAttribute("productAll",productAll);
		
		 return "/selectproduct";		
	}
   }

