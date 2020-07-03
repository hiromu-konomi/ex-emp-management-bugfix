package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex14")
public class Ex14Controller {

	@RequestMapping("")
	public String index(Model model) {
		List<String> nameList = new ArrayList<>();
		nameList.add(0, "山田");
		nameList.add(1, "鈴木");
		nameList.add(2, "伊藤");
		nameList.add(3, "吉田");
		nameList.add(4, "佐藤");
		model.addAttribute("nameList", nameList);
		return "ex-14";
	}
}
