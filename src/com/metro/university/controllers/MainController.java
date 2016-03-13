package com.metro.university.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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
	@Autowired
    private MessageSource messageSource;
	
	@RequestMapping("/welcome.htm")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		String message = "Привет друг!";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/contact.htm")
	public ModelAndView contact(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("contact");
	}
}
