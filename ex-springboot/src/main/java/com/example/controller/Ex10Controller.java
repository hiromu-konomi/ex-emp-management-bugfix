package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/ex10")
public class Ex10Controller {

	@Autowired
	private ServletContext application;

	@ModelAttribute
	public User setUser() {
		return new User();
	}

	@RequestMapping("")
	public String index() {
		return "ex-10-input";
	}

	@RequestMapping("/input")
	public String input(User user) {
		Integer count = (Integer) application.getAttribute("count");
		if (count == null) {
			count = 0;
		}
		++count;
		application.setAttribute("user", user);
		return "ex-10-output";
	}

	@RequestMapping("/output")
	public String output() {
		return "ex-10-output";
	}

	@RequestMapping("/output2")
	public String output2() {
		return "ex-10-output2";
	}
}
