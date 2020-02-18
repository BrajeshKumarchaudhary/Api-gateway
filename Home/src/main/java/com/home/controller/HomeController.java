package com.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/home")
	public String index()
	{
		return "HomeController";
	}
	
	
	
	
	
	
}
