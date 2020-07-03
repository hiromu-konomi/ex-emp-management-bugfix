package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CalcLogic;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private CalcLogic calclogic;
	
	@RequestMapping("/add")
	public String add() {
		int num1 = 2;
		int num2 = 3;
		int resultOfAdd = calclogic.add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + resultOfAdd);
		return "finished";
	}
	
	@RequestMapping("/sub")
	public String sub() {
		int num1 = 2;
		int num2 = 3;
		int resultOfSub = calclogic.sub(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + resultOfSub);
		return "finished";
	}
	
	@RequestMapping("/multi")
	public String multi() {
		int num1 = 2;
		int num2 = 3;
		int resultOfMulti = calclogic.multi(num1, num2);
		System.out.println(num1 + "x" + num2 + "=" + resultOfMulti);
		return "finished";
	}
	
	@RequestMapping("/div")
	public String div() {
		int num1 = 2;
		int num2 = 3;
		int resultOfDiv = calclogic.div(num1, num2);
		System.out.println(num1 + "÷" + num2 + "=" + resultOfDiv);
		return "finished";
	}
}
