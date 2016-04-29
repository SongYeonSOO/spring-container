package com.estsoft.spring_container;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;

	public User() {
		name = "default constructor";
	}

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
