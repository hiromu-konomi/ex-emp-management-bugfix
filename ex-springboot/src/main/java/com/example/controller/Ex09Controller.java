package com.example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex09")
public class Ex09Controller {

	@RequestMapping("")
	public String index() {
		return "ex-09";
	}

	@RequestMapping("/ex09-result")
	public String ex09Result(String mail, String password, Model model) {
		System.out.println("入力されたメールアドレスは" + mail);
		System.out.println("入力されたパスワードは" + password);
		String key = "loginResult";
		if (mail.equals("abc@gmail.com") && password.equals("abc")) {
			model.addAttribute(key, "成功");
		} else {
			model.addAttribute(key, "失敗");
		}

		return "ex-09-result";
	}
}
