package com.metro.university.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.metro.university.config.Actions;
import com.metro.university.config.Views;

/**
 * 
 * @author elpai
 *
 */
@Controller
public class MainController {
	@RequestMapping(Actions.MAIN_WELCOME)
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		String message = "Привет друг!";
		return new ModelAndView(Views.WELCOME, "message", message);
	}

	@RequestMapping(Actions.MAIN_EXIT)
	public ModelAndView exit(HttpServletRequest request, HttpServletResponse response) {
		String message = "Пока друг!";
		return new ModelAndView(Views.WELCOME, "message", message);
	}
}
