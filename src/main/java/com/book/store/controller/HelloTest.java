package com.book.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloTest {
	
	@GetMapping("/")
	public String hi() {
		
		return "test";
	}

}