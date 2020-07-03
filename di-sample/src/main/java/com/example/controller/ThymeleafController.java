package com.example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thy")
public class ThymeleafController {

	@RequestMapping("/result")
	public String result() {

		return "Thymeleaf";
	}
	
	
}
