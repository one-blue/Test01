package com.lxy.config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;

import com.lxy.service.UserDetailsServiceImpl;

@EnableWebSecurity  //开启MVC security安全支持
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	private DataSource dataSource;
	@Override 
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		 // 密码需要设置编码器
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
		 auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception { 
		//关闭CSRF防护功能
		http.csrf().disable();
		// 自定义用户授权管理
		http.authorizeRequests()
		        .antMatchers("/").permitAll()
				.antMatchers("/login/**").permitAll()
				.antMatchers("/css/**").permitAll()
				.antMatchers("/font/**").permitAll()
				.antMatchers("/fonts/**").permitAll()
				.antMatchers("/images/**").permitAll()
				.antMatchers("/touxiang/**").permitAll()
				.antMatchers("/js/**").permitAll()
				.antMatchers("/regist/**").permitAll()
				.antMatchers("/toUpload/**").permitAll()
				.antMatchers("/uploadFile/**").permitAll()
				.antMatchers("/user/**").hasRole("1")
				.antMatchers("/evaluate/**").hasRole("1")
				.antMatchers("/admin/**").hasRole("2")
				.anyRequest().authenticated()
	            .and() .formLogin();
		 
		//自定义用户登录控制
		http.formLogin()
		.loginPage("/userLogin").permitAll()
		.usernameParameter("name").passwordParameter("pwd")
		.defaultSuccessUrl("/index")
		.failureUrl("/userLogin?error");
//自定义用户退出控制
		http.logout()
		.logoutUrl("/myLogout")
		.logoutSuccessUrl("/");
		  
		/*//定制Remember—me记住我功能
			  http.rememberMe()
			  .rememberMeParameter("rememberme")
			  .tokenValiditySeconds(200)
			  //对Cookie信息进行持久化管理
			  .tokenRepository(tokenRepository());
	}
	//持久化Token存储
	@Bean
	public JdbcTokenRepositoryImpl tokenRepository() {
		JdbcTokenRepositoryImpl jr = new JdbcTokenRepositoryImpl();
		jr.setDataSource(dataSource);
		return jr;
}*/
}}