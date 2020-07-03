package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex11")
public class Ex11Controller {

	@ModelAttribute
	public Member setMember() {
		return new Member();
	}

	@RequestMapping("")
	public String index(Member member, Model model) {
		model.addAttribute("member", member);
		return "ex-11-register-member";
	}

	@RequestMapping("/register")
	public String register(Member member, Model model) {
		model.addAttribute("member", member);
		return "ex-11-register-member-output";
	}

	@RequestMapping("/output")
	public String output() {
		return "ex-11-register-member-output";
	}
}
