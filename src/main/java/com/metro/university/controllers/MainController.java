package com.metro.university.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metro.university.dao.impl.FilesDAOImpl;
import com.metro.university.dao.impl.SettingsDAOImpl;
import com.metro.university.entity.FilesEntity;
import com.metro.university.entity.SettingsEntity;
import com.metro.university.utils.DateUtil;
import com.metro.university.utils.Validator;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
    @Autowired
    SettingsDAOImpl settingsDAOImpl;


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

    @RequestMapping("/settings")
    public ModelAndView settings(HttpServletRequest request, HttpServletResponse response) {
        LOG.debug("Main controller: action settings");
        LOG.debug("Action started");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("settings");
        SettingsEntity settings = settingsDAOImpl.getSettings();
        LOG.trace("Found in db: settings " + settings);
        if (request.getMethod().equalsIgnoreCase("post")) {
            LOG.trace("request method: post");
            String dh = request.getParameter("dH");
            LOG.trace("dH: " + dh);
            String dv = request.getParameter("dV");
            LOG.trace("dV: " + dv);
            String ch = request.getParameter("cH");
            LOG.trace("cH: " + ch);
            String cv = request.getParameter("cV");
            LOG.trace("cV: " + cv);
            String length = request.getParameter("length");
            LOG.trace("length: " + length);

            if (Validator.isValidDoubleNumber(dh)) {
                settings.setDeltaHorizontal(Double.parseDouble(dh));
            }
            if (Validator.isValidDoubleNumber(dv)) {
                settings.setDeltaVertical(Double.parseDouble(dv));
            }
            if (Validator.isValidDoubleNumber(ch)) {
                settings.setCoefficientHorizontal(Double.parseDouble(ch));
            }
            if (Validator.isValidDoubleNumber(cv)) {
                settings.setCoefficientVertical(Double.parseDouble(cv));
            }
            if (Validator.isValidDoubleNumber(length)) {
                settings.setLength(Double.parseDouble(length));
            }
            LOG.trace("Save settings entity");
            settingsDAOImpl.updateSettings(settings);
        }
        mv.addObject("settings", settings);
        LOG.debug("Action finished");
        return mv;
    }


    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFileHandler(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            String name = DateUtil.getCurrentDate();
            String rootPath = request.getServletContext().getRealPath("/files/");
            LOG.trace("rootPath" + rootPath);
            File dir = new File(rootPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File serverFile = new File(dir.getAbsolutePath()
                    + File.separator + name + ".dat");
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(serverFile));
            stream.write(bytes);
            stream.close();
            Integer id = filesDAOImpl.createFile(name);
            LOG.info("Server File Location="
                    + serverFile.getAbsolutePath());
            return "redirect:/app/process?id=" + id;
        }
        return "redirect:/app/process";
    }
}
