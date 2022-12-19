package com.madhav.api.ResourceServer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/status/info")
	public String status() {
		return "Student endpoint called successfully";
	}
	
	
}
