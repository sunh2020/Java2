package com.sunh.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {
	@RequestMapping("/")
	public String client() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
