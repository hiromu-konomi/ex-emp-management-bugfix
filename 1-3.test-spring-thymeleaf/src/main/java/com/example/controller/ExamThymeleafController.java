package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/th02")
public class ExamThymeleafController {
	

	@RequestMapping("")
	public String index() {
		return "ex-thymeleaf-input";
	}
	
	@RequestMapping("/receive")
	public String receive(Member member, Model model) {
		
		model.addAttribute("member", member);
		return "ex-thymeleaf-result";
	}
}
