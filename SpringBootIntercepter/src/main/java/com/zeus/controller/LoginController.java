package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeus.domain.Member;
import lombok.extern.java.Log;

@Log
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		log.info("loginForm");

		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Member member, Model model) {
		log.info("login");

		log.info("login userId = " + member.getUserId());
		log.info("login userPw = " + member.getUserPw());
		model.addAttribute("result", "로그인 되었습니다.");
		return "success";
	}

}