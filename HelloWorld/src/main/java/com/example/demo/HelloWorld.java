package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/msg")
	public String message()
	{
		return "Welcome to Spring Boot";
		
	}

}
