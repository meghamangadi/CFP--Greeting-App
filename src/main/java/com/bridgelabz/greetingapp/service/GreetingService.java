package com.bridgelabz.greetingapp.service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingapp.entity.GreetingEntity;
import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.IGreetingRepository;

@Service
public class GreetingService implements IGreetingService  {

	private static final String template = "Hello ,%s!";
	private final AtomicLong counter = new AtomicLong();
    @Autowired
    private IGreetingRepository greetingRepository;
	
	@Override
	public Greeting greeting(String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@Override
	public Greeting greetings(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@Override
	public Greeting greetingForUser(User user) {
		return new Greeting(counter.incrementAndGet(), String.format(template, user.getFirstName(),user.getLastName()));
				 
	}

	@Override
	public void saveGreetingForUser(User user) {	
		GreetingEntity greeting=new GreetingEntity();
		greeting.setGreetingMessage("Hello"+user.getFirstName());
		greetingRepository.save(greeting);
		
	}

	@Override
	public   String getMessage(Long id) {
		    Optional<GreetingEntity> value=greetingRepository.findById(id);		   
			return  value.get().getGreetingMessage();
		  
		 
	}

}
