package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receive")
public class ReceiveController {
	
	@RequestMapping("")
	public String index() {
		return "info-form";
	}
	
	@RequestMapping("/receive-info")
	public String receiveInfo(String name, String age) {
		System.out.println("入力した名前は" + name + "です。"); 
		System.out.println("入力した年齢は" + age + "です。");
		return "finished";
	}
}
