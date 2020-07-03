package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
//	
//	@ModelAttribute
//	public ReceiveNameForm setName() {
//		return new ReceiveNameForm();
//	}

	@RequestMapping("")
	public String index() {
		return "exam-03";
	}
	
	@RequestMapping("/input")
	public String input(String name) {
		System.out.println("入力された値は" + name + "です。");
		return "finished";
	}
	
	@RequestMapping("/receive")
	public String receive(ReceiveNameForm form) {
		System.out.println("入力された値は" + form.getName() + "です。");
		return "finished";
	}
}
