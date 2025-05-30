package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BanckOperationContriller   {
	@GetMapping("/")
	public String showHomePage()
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    String username = authentication.getName();  // Get logged-in username
	   System.out.println(username);
		return "home";
	}
	
	@GetMapping("/balence")
	public String showBalence(Map<String,Object> map)
	{
		 int balence=new Random().nextInt(200000);
		map.put("balence", balence);
		return "show_balence";
	}
	@GetMapping("/offer")
	public String showOffer()
	{
		return "show_offer";
	}
	
	@GetMapping("/approve")
	public String approveLoan(Map<String,Object> map)
	{
		 int amount=new Random().nextInt(200000);
		 map.put("amount", amount);
		return "loan_approve";
	}
	
	@GetMapping("/error")
	public String showError()
	{
		return "show_error";
	}

}
