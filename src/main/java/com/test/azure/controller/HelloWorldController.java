package com.test.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping(value = "/hello")
	public String test() {
		
		return "Welcome Sai Priya, Pandaga Chesko";
	
	}

}
