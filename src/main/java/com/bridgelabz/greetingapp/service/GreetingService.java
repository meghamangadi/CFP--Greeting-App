package com.bridgelabz.greetingapp.service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import com.bridgelabz.greetingapp.model.Greeting;

@Service
public class GreetingService {

	private static final String template = "Hello ,%s!";
	private final AtomicLong counter = new AtomicLong();

	public Greeting greeting(String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	public Greeting greetings(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
