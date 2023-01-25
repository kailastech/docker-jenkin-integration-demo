package com.kailasit.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("home")
	public void home() {
		System.out.println("Welcome to Java Technology...!");
	}
	
}
