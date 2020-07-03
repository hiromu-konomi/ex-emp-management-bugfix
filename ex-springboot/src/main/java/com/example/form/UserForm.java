package com.example.form;

import java.util.List;

public class UserForm {
	private String name;
	private String email;
	private String password;
	private List<Integer> hobbyList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<Integer> hobbyList) {
		this.hobbyList = hobbyList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
