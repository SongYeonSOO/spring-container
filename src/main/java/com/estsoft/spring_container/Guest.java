package com.estsoft.spring_container;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//friend를 autowired한번 해보자!
public class Guest {
	private String name;
	private List<User> users;

	@Autowired
	private Friend friend;

	public Guest() {
		this.name = "guestName";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", users=" + users + ", friend=" + friend + "]";
	}

}
