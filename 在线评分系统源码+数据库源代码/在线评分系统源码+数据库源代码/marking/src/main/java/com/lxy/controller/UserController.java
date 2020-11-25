package com.lxy.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lxy.domain.Authority;
import com.lxy.domain.Product;
import com.lxy.domain.Score;
import com.lxy.domain.UserAuthority;
import com.lxy.domain.UserInfo;
import com.lxy.repository.AuthorityRepository;
import com.lxy.repository.ScoreRepository;
import com.lxy.repository.UserAuthorityRepository;
import com.lxy.repository.productRepository;
import com.lxy.service.ScoreService;
import com.lxy.service.UserInfoService;
import com.lxy.utils.GetUserName;



@Controller
public class UserController {
	
	@Autowired
	com.lxy.service.UserService UserService;
	@Autowired
	private ScoreService scoreService;
	@Autowired
	private productRepository productRepository;
	@Autowired
	private ScoreRepository scoreRepository;
	@Autowired
	private com.lxy.service.SendEmailService sendEmailService;
	@Autowired
	private com.lxy.service.ScheduledTaskService ScheduledTaskService;
	 @GetMapping("/regist")
		public String regist() {
			
			return "regist";
		}
	    @PostMapping("/regist")
	   	public String regist1(Model model
			,
					@RequestParam("image") String image, 
					@RequestParam("name") String  name,
					@RequestParam("password") String password,
					@RequestParam("email") String email) {
	    	 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
	    	List<UserInfo> userfindAll = UserService.findAll();
	    	for(UserInfo u:userfindAll) {
	    	if(u.getUserName().equals(name) ) {
	    		return "regist";
	    	}
	    }	  
	    	
			UserInfo user= new UserInfo();
			user.setEmail(email);
			user.setPassword(encoder.encode(password));
			user.setTouImage(image);
			user.setUserName(name);
			user.setVaild('1');
			UserService.save(user);
	        String username=name;
			String to=email;
			String subject="【在线评分系统】";
			StringBuilder text =new StringBuilder();
			text.append("<html><head></head>");
			text.append("<body><h1>"+username+"您好！</h1>"+"恭喜你注册成功！你可进行评分操作");
			text.append("</html>");
			
			//发送纯文本邮
			sendEmailService.sendSimpleEmail(to, subject, text.toString());
				return "/index";
	   	
	    }
	@GetMapping("/userLogin")
	public String toLoginPage() {
	return "login/login";
}
	@PostMapping("/userLogin")
	public String toLoginPage1() {
		
		
		return "login/login";
	}
	
	@GetMapping("/admin")
	public String toRegist1(Model model) {	
		List<Score> score = scoreService.findAll();
		model.addAttribute("time",ScheduledTaskService.scheduledTaskImmediately());
		model.addAttribute("score",score);
			return "/admin";
		}
	
	@GetMapping("/information")
	public String infor(Model model) {
		GetUserName getUserName = new GetUserName();
		String userName = getUserName.getUserName();
		UserInfo findByName = UserService.findByName(userName);
		model.addAttribute("UserInfo",findByName);
		System.out.println(findByName+"????//////////");
		return "/information";
	}
	    //进入评分
		@GetMapping("/evaluates")
		public String evaluate(Model model ,
				@RequestParam("param2") int id) {
		
			Optional<Product> findById = productRepository.findById(id);
			
			String productName = findById.get().getProductName();
			model.addAttribute("productName", productName);
				return "/evaluate";
			}
		  //保存分数
				@GetMapping("/save")
				public String save(Model model
				,
						@RequestParam("param3") String score, 
						@RequestParam("param4") String  productName,
						@RequestParam("param5") String userName) {
				
					List<Score> scorefindAll = scoreService.findAll();
					for(Score s:scorefindAll) {
						if(s.getUserName().equals(userName)&& s.getProductName().equals(productName)) {
							return "redirect:/index";
						}
					}
					Score s=new Score();
					s.setScore(score);
				    s.setUserName(userName);
				    s.setProductName(productName);
				    scoreRepository.save(s);
					return "redirect:/index";
					}
	
	
	
}
