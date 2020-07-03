package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class EmployeeController {
	
	@RequestMapping("")
	public String index() {
		return "email";
	}
}
