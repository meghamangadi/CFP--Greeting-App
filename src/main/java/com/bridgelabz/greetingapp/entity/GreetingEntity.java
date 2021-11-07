package com.bridgelabz.greetingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GreetingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String greetingMessage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGreetingMessage() {
		return greetingMessage;
	}
	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
}
