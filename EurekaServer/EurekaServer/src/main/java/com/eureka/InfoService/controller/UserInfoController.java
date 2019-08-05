package com.eureka.InfoService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	@RequestMapping("/user")
	public String getUserInfo(){
		return "HelloWorld";
	}
	
}
