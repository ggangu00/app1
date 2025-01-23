package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/")
	public String main() {
		return "안뇽하뗴염";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
}
