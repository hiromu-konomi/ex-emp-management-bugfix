package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Development;
import com.example.service.DevelopmentService;

@Controller
@RequestMapping("/development")
public class DevelopmentController {

	@Autowired
	private DevelopmentService service;

	@RequestMapping("/execute")
	public String execute() {
		Development development = new Development();
		development.setDevelopmentName("人事部");
		development.setDevelopmentId(6);
		service.save(development);

		Development development2 = service.load(2);
		System.out.println(development2);
		service.delete(2);
		service.findAll().forEach(System.out::println);
		return "finished";
	}
}
