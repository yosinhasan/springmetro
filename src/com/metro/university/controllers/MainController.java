package com.metro.university.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.metro.university.charts.PieChartData;
import com.metro.university.charts.PieChartData.KeyValue;
import com.metro.university.utils.ReadFile;

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

	@RequestMapping("welcome")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOG.debug("Main controller: action welcome");
		LOG.debug("Action started");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		LOG.trace("Set request parameter: pieDataList ");
		List<KeyValue> pieDataList = PieChartData.getPieDataList();
		LOG.trace(pieDataList);
		mv.addObject("pieDataList", pieDataList);
		String path = request.getServletContext().getRealPath("/files/112625.dat");
		LOG.trace("Path: " + path);
		ReadFile rf = new ReadFile(new File(path));
		LOG.trace("Set request parameter: dataentity");
		mv.addObject("dataentity", rf.getDataEntities());
		LOG.trace("Set request parameter: picketentity");
		mv.addObject("picketentity", rf.getPicketEntities());
		LOG.trace(rf.getPicketEntities());
		LOG.debug("Action finished");
		return mv;
	}

	@RequestMapping("/contact.htm")
	public ModelAndView contact(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("contact");
	}
}
