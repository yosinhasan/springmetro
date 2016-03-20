package com.metro.university.dao.impl;

import com.metro.university.entity.FilesEntity;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Component
public class FilesDAOImpl {
    Logger LOG = Logger.getLogger(FilesDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Constructor.
     */
    public FilesDAOImpl() {

    }

    /**
     * Get files.
     *
     * @return List<FilesEntity>
     */
    @Transactional
    public List<FilesEntity> getFiles() {
        LOG.debug("Query Get all files started.");
        Session session = sessionFactory.getCurrentSession();
        List<FilesEntity> files = (List<FilesEntity>) session.createCriteria(FilesEntity.class).list();
        LOG.debug("Query finished.");
        return files;
    }

    /**
     * Get file.
     *
     * @param fileName filename
     * @return FilesEntity
     */

    @Transactional
    public FilesEntity getFile(String fileName) {
        LOG.debug("Query get file by filename started.");
        Session session = sessionFactory.getCurrentSession();
        FilesEntity file = (FilesEntity) session.createCriteria(FilesEntity.class).add(Restrictions.eq("name", fileName)).uniqueResult();
        LOG.debug("Query finished.");
        return file;
    }

    /**
     * Get file.
     *
     * @param id id
     * @return FilesEntity
     */

    @Transactional
    public FilesEntity getFile(Integer id) {
        LOG.debug("Query Get file by id started.");
        Session session = sessionFactory.getCurrentSession();
        FilesEntity file = (FilesEntity) session.createCriteria(FilesEntity.class).add(Restrictions.eq("id", id)).uniqueResult();
        LOG.debug("Query finished.");
        return file;
    }

    /**
     * Delete file by id.
     *
     * @param id id
     * @return FilesEntity
     */

    @Transactional
    public Boolean deleteFile(Integer id) {
        LOG.debug("Query delete file by id started.");
        Session session = sessionFactory.getCurrentSession();
        if (id >= 0) {
            FilesEntity object = new FilesEntity();
            object.setId(id);
            session.delete(object);
            return true;
        }
        LOG.debug("Query finished.");
        return false;
    }

    @Transactional
    public Integer createFile(String filename) {
        LOG.debug("Query create file started.");
        Session session = sessionFactory.getCurrentSession();
        FilesEntity object = new FilesEntity();
        object.setName(filename);
        session.saveOrUpdate(object);
//        Integer id = object.getId();
        Integer id = getFile(filename).getId();
        LOG.debug("Query finished.");
        return id;
    }
}
