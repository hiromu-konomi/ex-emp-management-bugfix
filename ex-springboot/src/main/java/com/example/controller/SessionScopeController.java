package com.example.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session-scope")
public class SessionScopeController {
	
	// sessionスコープを使うための設定
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		// 入力画面にフォワード
		return "session-scope-form";
	}
	
	@RequestMapping("/input-name")
	public String inputName(String name) {
		// sessionスコープに名前をnameというキーをつけて格納
		session.setAttribute("name", name);
		// page1画面へフォワード
		return "result-session-scope1";
	}
	
	@RequestMapping("/to-page1")
	public String toPage1() {
		// page1画面にフォワード
		return "result-session-scope1";
	}
	
	@RequestMapping("/to-page2")
	public String toPage2() {
		// page2画面にフォワード
		return "result-session-scope2";
	}
	
	@RequestMapping("/to-page3")
	public String toPage3() {
		// page3画面にフォワード
		return "result-session-scope3";
	}
}
