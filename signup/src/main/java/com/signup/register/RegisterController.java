package com.signup.register;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	
	@RequestMapping(value="/")
	public String register()
	{
		return "RegisterController";
	}
	
	
}
