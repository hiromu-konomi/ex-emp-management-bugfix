package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex13")
public class Ex13Controller {

	@RequestMapping("")
	public String index() {
		return "ex-13-register-member";
	}
	
	@RequestMapping("/input-form")
	public String input(Member member, Model model) {
		model.addAttribute("member", member);
		return "ex-13-result";
	}
}
