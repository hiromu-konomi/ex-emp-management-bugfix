package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FactorialLogic;

@Controller
@RequestMapping("/factorial")
public class FactorialController {

	@Autowired
	private FactorialLogic logic;
	
	@RequestMapping("/view-result")
	public String viewResult(Model model) {
		int num = 5;
		int resultOfFactorial = logic.getFactorial(num);
		
		model.addAttribute("result", resultOfFactorial);
		System.out.println(num + "の階乗は" + resultOfFactorial);
		return "finished";
	}
}
