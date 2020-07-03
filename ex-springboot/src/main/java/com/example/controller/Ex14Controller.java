package com.example.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex14")
public class Ex14Controller {

	@RequestMapping("")
	public String index(Model model) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("山田");
		nameList.add("鈴木");
		nameList.add("伊藤");
		nameList.add("吉田");
		nameList.add("佐藤");
		model.addAttribute("nameList", nameList);

		return "ex-14";
	}
}
