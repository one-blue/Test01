package com.lxy.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class GetUserName {
	public String getUserName() {
		SecurityContext attribute = SecurityContextHolder.getContext();
		Authentication authentication = attribute.getAuthentication();
		UserDetails principal = (UserDetails) authentication.getPrincipal();
		return principal.getUsername();
	}
}
