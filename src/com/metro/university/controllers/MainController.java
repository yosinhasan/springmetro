package com.metro.university.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
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
	private static final Logger LOG = Logger.getLogger(MainController.class);
	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/welcome.htm")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		LOG.debug("Main controller: action welcome");
		LOG.debug("Action started");
		LOG.trace("Set request parameter: message ");
		String message = "Привет друг!";
		LOG.debug("Action finished");
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/contact.htm")
	public ModelAndView contact(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("contact");
	}
}
