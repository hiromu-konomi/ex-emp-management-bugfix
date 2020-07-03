package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex-04";
	}
	
	@RequestMapping("/ex-04-success")
	public String ex04Success(String mail, String password) {
		System.out.println("入力されたメールアドレスは" + mail);
		System.out.println("入力されたパスワードは" + password);
		
		if(mail.equals("abc@gmail.com") && password.equals("abc")) {
			return "ex-04-success";
		} else {
			return ex04Failure(mail, password);
		}
	}
	
	@RequestMapping("/ex-04-failure")
	public String ex04Failure(String mail, String password) {
		return "ex-04-failure";
	}
}
