package com.salon.controller.aTest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@GetMapping
	@ResponseBody
	public String checkAuth() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		
		System.err.println(auth.getPrincipal().toString());
		System.err.println(auth.getName());
		System.err.println(auth.getCredentials());
		
		
		return auth.getPrincipal().toString();
	}
	
}
