package com.metro.university.dao.impl;

import com.metro.university.dao.interfaces.FilesDAO;
import com.metro.university.entity.FilesEntity;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class FilesDAOImpl {
    Logger LOG = Logger.getLogger(FilesDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    private ProjectionList bookProjection;

    public FilesDAOImpl() {

    }
    @Transactional
    public List<FilesEntity> getFiles() {
        LOG.debug("Query Get all files started");
        LOG.trace("Session factory: " + sessionFactory);
        Session session = sessionFactory.getCurrentSession();
        LOG.trace("Session: " + session);
        List<FilesEntity> files = (List<FilesEntity>) session.createCriteria(FilesEntity.class).list();
        LOG.debug("Query finished");
        return files;
    }

    @Transactional
    public List<FilesEntity> getFiles(String fileName) {
        List<FilesEntity> files = null;
        return files;
    }

    @Transactional
    public Object getFieldValue(Long id, String fieldName) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(FilesEntity.class);
        criteria.setProjection(Property.forName(fieldName));
        criteria.add(Restrictions.eq("id", id));
        return criteria.uniqueResult();

    }


}
