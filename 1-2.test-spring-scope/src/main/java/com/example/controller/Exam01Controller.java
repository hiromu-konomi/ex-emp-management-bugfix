package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@ModelAttribute
	public UserForm setUpUser() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/input")
	public String input(UserForm user, Model model) {
		String email = user.getEmail();
		String password = user.getPassword();
		String loginKey;
		
		if(email.equals("yamada@sample.com") && password.equals("yamayama")) {
			loginKey = "成功";
		} else {
			loginKey = "失敗";
		}
		
		model.addAttribute("loginKey", loginKey);
		
		return "exam01-result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "exam01-result";
	}
}
