package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.UserSession;

@Controller
@RequestMapping("/exse")
public class ExSeController {
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public UserSession setUpUser() {
		return new UserSession();
	}

	@RequestMapping("")
	public String index() {
		return "ex-se-input";
	}
	
	@RequestMapping("/input")
	public String input(UserSession userSession) {
		session.setAttribute("user", userSession);
		return "ex-se-output";
	}
}
