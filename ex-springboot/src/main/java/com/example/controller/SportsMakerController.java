package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.SportsUser;

@Controller
@RequestMapping("/sports-maker")
public class SportsMakerController {
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public SportsUser setSportsUser() {
		return new SportsUser();
	}
	
	@RequestMapping("")
	public String index() {
		return "sports-maker-input";
	}
	
	@RequestMapping("/input")
	public String input() {
		
		return "sports-maker-output";
	}
}
