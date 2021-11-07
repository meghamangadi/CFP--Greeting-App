package com.bridgelabz.greetingapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.service.GreetingService;

@RestController
public class GreetingController {

	 @Autowired
	 private GreetingService greetingService;
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	return	greetingService.greeting(name);
		 
	}

	@GetMapping("greeting/{name}")
	public Greeting greetings(@PathVariable String name) {
		return	greetingService.greetings(name); 
	}

}
