package com.estsoft.spring_container;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//bean설정으로 test하기위해 component 삭제
//@Component
public class User {
	public String name;
	public String email;

	// @Autowired : 지금도 이 방법이 가능하지만 이걸 쓰지않고 bean설정을 통해서 해보자!
	private Friend friend;

	public User() {
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", friend=" + friend + "]";
	}

}
