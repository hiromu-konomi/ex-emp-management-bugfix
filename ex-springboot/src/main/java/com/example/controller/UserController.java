package com.example.controller;

import java.util.List;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@ModelAttribute
	public UserForm setUserForm() {
		return new UserForm();
	}
	/**
	 * 入力画面を表示する
	 * @param modelモデル
	 * @return 入力画面
	 */
	@RequestMapping("")
	public String index(Model model) {
		Map<Integer, String> hobbyMap = new LinkedHashMap<>();
		hobbyMap.put(1, "野球");
		hobbyMap.put(2, "サッカー");
		hobbyMap.put(3, "テニス");
		model.addAttribute("hobbyMap", hobbyMap);
		
		return "user/input";
	}
	
	/**
	 * ユーザ情報を登録する
	 * 
	 * @param form フォーム
	 * @param redirectAttributes flashスコープを使うためのオブジェクト
	 * @return 登録完了画面へリダイレクト
	 */
	@RequestMapping("/create")
	public String create(
			UserForm form // リクエストパラメータを取得
			, RedirectAttributes redirectAttributes // flashスコープ使用するための準備
			) {
		User user = new User();
		// formオブジェクトからuserオブジェクトにプロパティ値をコピー
		BeanUtils.copyProperties(form, user);
		// 上記でコピーされなかったhobbyListプロパティを手動でコピー
		List<String> hobbyList = new ArrayList<String>();
		for(Integer hobbyCode:form.getHobbyList()) {
			switch(hobbyCode) {
			case 1:
				hobbyList.add("野球");
				break;
			case 2:
				hobbyList.add("サッカー");
				break;
			case 3:
				hobbyList.add("テニス");
				break;
			}
		}
		user.setHobbyList(hobbyList);
		
		// 実際の業務処理「ユーザー登録をする」サービスクラスの呼び出し
		UserService userService = new UserService();
		user = userService.save(user);
		
		// 今回はrequestスコープは使わない
		// model.addAttribute("user", user);
		// 代わりにflashスコープに格納する
		redirectAttributes.addFlashAttribute("user", user);
		
		// 登録完了画面にフォワードするメソッドにリダイレクト
		return "redirect:/user/toresult";
	}

	/**
	 * 登録完了画面へフォワード
	 * @return 登録完了画面
	 */
	@RequestMapping("/toresult")
	public String toresult() {
		//登録完了画面へフォワード
		return "user/result";
	}
}
