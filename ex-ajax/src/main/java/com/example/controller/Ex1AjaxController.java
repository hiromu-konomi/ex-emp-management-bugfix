package com.example.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;

@RestController
@RequestMapping("/ajaxc")
public class Ex1AjaxController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/email")
	public Map<String, String> result(String mailAddress) {
		System.out.println("入力値=["+ mailAddress +"]");
		
		Map<String, String> map = new HashMap<>();

		if (Objects.isNull(service.search(mailAddress))) {
			map.put("code", "200");
		} else {
			map.put("code", "400");
		}

		return map;
	}
}
