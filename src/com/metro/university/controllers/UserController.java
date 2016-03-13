package com.metro.university.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
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
	private static final Logger LOG = Logger.getLogger(MainController.class);

	@RequestMapping("/login.htm")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		LOG.debug("User contoller: action login");
		LOG.debug("Login action started");
		LOG.debug("Login action finished");
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
