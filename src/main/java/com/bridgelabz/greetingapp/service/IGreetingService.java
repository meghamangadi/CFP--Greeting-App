package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;

public interface IGreetingService {

	public Greeting greeting(String name); 

	public Greeting greetings(String name); 
	public Greeting greetingForUser(User user);
	public void saveGreetingForUser(User user);
}
