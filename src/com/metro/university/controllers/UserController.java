package com.metro.university.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author elpai
 *
 */
@Controller
public class UserController {
	@RequestMapping("/login.htm")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("login");
	}

	@RequestMapping("/logout.htm")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/signup.htm")
	public ModelAndView contact(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("signup");
	}
}
