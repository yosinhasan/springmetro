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
public class MainController {
	@RequestMapping("/welcome.htm")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		String message = "Привет друг!";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/exit.htm")
	public ModelAndView exit(HttpServletRequest request, HttpServletResponse response) {
		String message = "Пока друг!";
		return new ModelAndView("welcome", "message", message);
	}
}
