package com.example.controller;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/ex16")
public class Ex16Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		Object arrayList = (Object) application.getAttribute("user");
		if (arrayList == null) {
			arrayList = 0;
			ArrayList<User> userList = new ArrayList<>();
			application.setAttribute("userList", userList);
		}
		arrayList++;
		application.setAttribute("userList", user);
		return "ex-16";
	}

	@RequestMapping("/post")
	public String post(String name, String comment) {
		
		
		return "ex-16";
	}
}
