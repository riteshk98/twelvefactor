package com.rk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@GetMapping("/")
	String hello() {
		return "Hello";
	}
}
