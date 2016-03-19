package com.metro.university.controllers;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metro.university.dao.impl.FilesDAOImpl;
import com.metro.university.entity.FilesEntity;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.metro.university.charts.IntervalChart;
import com.metro.university.utils.ReadFile;
import com.metro.university.utils.TotalMark;

/**
 * @author elpai
 */
@EnableTransactionManagement
@Controller
public class MainController {
    private static final Logger LOG = Logger.getLogger(MainController.class);
    @Autowired
    private MessageSource messageSource;
    @Autowired
    FilesDAOImpl filesDAOImpl;


    @RequestMapping("/process")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOG.debug("Main controller: action process");
        LOG.debug("Action started");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("process");
        LOG.trace("Set request parameter: pieDataList ");
        String path = request.getServletContext().getRealPath("/files/112625.dat");
        LOG.trace("Path: " + path);
        ReadFile rf = new ReadFile(new File(path));
        List<IntervalChart.KeyValue> vert = IntervalChart.getVertical(rf.getDataEntities());
        List<IntervalChart.KeyValue> hor = IntervalChart.getHorizontal(rf.getDataEntities());
        LOG.trace("Set request parameter: vertical");
        mv.addObject("vertical", vert);
        LOG.trace("Set request parameter: horizontal");
        mv.addObject("horizontal", hor);
        TotalMark marks = new TotalMark(rf.getPicketEntities(), rf.getDataEntities());
        List<String> result = marks.getResult();
        LOG.trace("Set request parameter: marks");
        mv.addObject("marks", result);
        LOG.debug("Action finished");
        return mv;
    }
    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
        LOG.debug("Main controller: action welcome");
        LOG.debug("Action started");
        List<FilesEntity> list = filesDAOImpl.getFiles();
        LOG.trace("Found in db: files = " + list);
        LOG.debug("Action finished");
        return new ModelAndView("welcome");
    }
}
