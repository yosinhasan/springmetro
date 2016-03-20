package com.metro.university.dao.impl;

import com.metro.university.entity.SettingsEntity;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class SettingsDAOImpl {
    Logger LOG = Logger.getLogger(SettingsDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Constructor.
     */
    public SettingsDAOImpl() {

    }

    /**
     * Get settings.
     *
     * @return SettingsEntity
     */

    @Transactional
    public SettingsEntity getSettings() {
        LOG.debug("Query get settings started.");
        Session session = sessionFactory.getCurrentSession();
        SettingsEntity settings = (SettingsEntity) session.createCriteria(SettingsEntity.class).uniqueResult();
        LOG.debug("Query finished.");
        return settings;
    }
    /**
     * Get settings.
     *
     * @return SettingsEntity
     */

    @Transactional
    public void updateSettings(SettingsEntity entity) {
        LOG.debug("Query get settings started.");
        Session session = sessionFactory.getCurrentSession();
        LOG.trace("Entity to update: " + entity);
        session.update(entity);
        LOG.debug("Query finished.");
        return;
    }
}
