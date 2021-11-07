package com.bridgelabz.greetingapp.service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;

@Service
public class GreetingService implements IGreetingService  {

	private static final String template = "Hello ,%s!";
	private final AtomicLong counter = new AtomicLong();
    
	@Override
	public Greeting greeting(String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@Override
	public Greeting greetings(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	 
	public Greeting greetingForUser(User user) {
		return new Greeting(counter.incrementAndGet(), String.format(template, user.getFirstName(),user.getLastName()));
				 
	}

}
