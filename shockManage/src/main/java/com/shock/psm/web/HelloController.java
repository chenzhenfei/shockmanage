package com.shock.psm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/index")
	public String index(){
		return "hello rest-webService";
	}
	
}
