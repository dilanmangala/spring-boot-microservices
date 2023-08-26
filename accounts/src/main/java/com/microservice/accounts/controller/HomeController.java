package com.microservice.accounts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private ServerProperties serverProperties;
	
	@Value("${bank.name}")
	private String bankName;

	
	@GetMapping(value = "/home")
	public String home() {
		log.info("Port Number : {}", serverProperties.getPort());
		log.info("Bank Name : {}", bankName);
		return "Welcome To Account API Service";
	}
}
