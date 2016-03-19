package com.metro.university.controllers;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metro.university.dao.impl.FilesDAOImpl;
import com.metro.university.entity.FilesEntity;
import com.metro.university.utils.Validator;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.metro.university.charts.IntervalChart;
import com.metro.university.utils.ReadFile;
import com.metro.university.utils.TotalMark;

/**
 * @author elpai
 */
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
        String id = request.getParameter("id");
        LOG.trace("Request parameter: " + id);
        if (Validator.isValidNumber(id)) {
            LOG.trace("Set request parameter: pieDataList ");
            FilesEntity file = filesDAOImpl.getFile(Integer.parseInt(id));
            LOG.trace("Found in db: file by id " + file);
            if (file != null) {
                String path = request.getServletContext().getRealPath("/files/" + file.getName() + ".dat");
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
            }
        }
        LOG.debug("Action finished");
        return mv;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
        LOG.debug("Main controller: action welcome");
        LOG.debug("Action started");

        LOG.debug("Action finished");
        return new ModelAndView("welcome");
    }

    @RequestMapping("/show")
    public ModelAndView show(HttpServletRequest request, HttpServletResponse response) {
        LOG.debug("Main controller: action show");
        LOG.debug("Action started");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");
        List<FilesEntity> files = filesDAOImpl.getFiles();
        mv.addObject("files", files);
        LOG.debug("Action finished");
        return mv;
    }
    @RequestMapping("/delete")
    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
        LOG.debug("Main controller: action delete");
        LOG.debug("Action started");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("delete");
        String id = request.getParameter("id");
        LOG.trace("Request parameter: " + id);
        if (Validator.isValidNumber(id)) {
            FilesEntity object = filesDAOImpl.getFile(Integer.parseInt(id));
            if (object != null) {
                String path = request.getServletContext().getRealPath("/files/" + object.getName() + ".dat");
                File delObject = new File(path);
                delObject.delete();
                filesDAOImpl.deleteFile(Integer.parseInt(id));
            }
        }
        List<FilesEntity> files = filesDAOImpl.getFiles();
        mv.addObject("files", files);
        LOG.debug("Action finished");
        return mv;
    }
}
