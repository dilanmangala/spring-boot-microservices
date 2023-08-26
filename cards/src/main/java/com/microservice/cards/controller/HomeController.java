package com.microservice.cards.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cards")
public class HomeController {
	
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping(value = "/home")
	public String home() {
		log.info("Inside Home Controller");
		return "Welcome To Cards API Service";
	}
}
