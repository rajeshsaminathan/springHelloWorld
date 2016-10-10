package com.rajesh.springhelloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@RequestMapping("/test")
	public String home(){
		return "Hello World!!!";
				
	}
}
