package com.example.controller;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.Questionnaire;
import com.example.form.QuestionnaireForm;

@Controller
@RequestMapping("/ex17")
public class QuestionnaireController {

	@RequestMapping("")
	public String index(Model model) {

		Map<Integer, String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "テニス");
		hobbyMap.put(2, "野球");
		hobbyMap.put(3, "ゴルフ");

		model.addAttribute("hobbyMap", hobbyMap);

		return "input";
	}

	@RequestMapping("/create")
	public String create(QuestionnaireForm form, RedirectAttributes redirectAttributes) {
		Questionnaire questionnaire = new Questionnaire();

		List<String> hobbyList = new ArrayList<>();
		for (Integer hobbyCode : form.getHobbyList()) {
			switch (hobbyCode) {
			case 1:
				hobbyList.add("テニス");
				break;
			case 2:
				hobbyList.add("野球");
				break;
			case 3:
				hobbyList.add("ゴルフ");
				break;
			}
		}
		questionnaire.setHobbyList(hobbyList);

		redirectAttributes.addFlashAttribute("questionnaire", questionnaire);
		return "redirect:/ex17/toresult";
	}

	@RequestMapping("/toresult")
	public String toresult() {
		return "result";
	}
}
