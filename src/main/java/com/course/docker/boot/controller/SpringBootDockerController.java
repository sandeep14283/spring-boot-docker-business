package com.course.docker.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDockerController {
	
	@GetMapping("/")
	public String getMessage() {
		return "A dockerized Spring Boot App";
	}
}
