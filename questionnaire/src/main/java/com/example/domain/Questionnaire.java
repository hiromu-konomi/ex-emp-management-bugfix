package com.example.domain;

import java.util.List;

public class Questionnaire {
	private String name;
	private String email;
	private String gender;
	private List<String> hobbyList;
	private String language;
	private String others;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
}
