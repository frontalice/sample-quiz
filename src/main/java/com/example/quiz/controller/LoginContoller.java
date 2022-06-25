package com.example.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContoller {
	@RequestMapping("loginForm")
	String loginForm() {
		return "login/loginForm";
	}
}
