package com.metro.university.controllers;

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
	public ModelAndView helloworld() {
		String message = "Привет друг!";
		return new ModelAndView(Views.WELCOME, "message", message);
	}

	@RequestMapping(Actions.MAIN_EXIT)
	public ModelAndView exit() {
		String message = "Пока друг!";
		return new ModelAndView(Views.WELCOME, "message", message);
	}
}
