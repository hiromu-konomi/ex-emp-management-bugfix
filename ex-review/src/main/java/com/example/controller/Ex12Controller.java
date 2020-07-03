package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex12")
public class Ex12Controller {

	@RequestMapping("")
	public String index() {
		return "ex-12-register-member";
	}
	
	@RequestMapping("/input-form")
	public String input(Member member, Model model) {
		model.addAttribute("member", member);
		return "ex-12-register-member-output";
	}
}
